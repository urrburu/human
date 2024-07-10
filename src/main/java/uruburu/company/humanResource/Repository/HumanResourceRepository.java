package uruburu.company.humanResource.Repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;
import uruburu.company.Salary.Entity.Salary;
import uruburu.company.humanResource.DTO.HumanResourceParameter;
import uruburu.company.humanResource.Entity.HumanResource;

import java.util.List;

@Repository
public class HumanResourceRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public HumanResource getOneHumanResource(Long id) {
        return entityManager.find(HumanResource.class, id);
    }

    public HumanResource addHumanResource(HumanResource humanResource) {
        entityManager.persist(humanResource);
        return humanResource;
    }

    public void deleteHumanResource(Long id) {
        entityManager.remove(entityManager.find(HumanResource.class, id));
    }

    public void updateHumanResource(Long id, HumanResourceParameter updateHumanResource) {
        HumanResource humanResource = entityManager.find(HumanResource.class, id);
        humanResource.setName(updateHumanResource.getName());
        entityManager.merge(updateHumanResource);
    }

    public List<HumanResource> getHumanResourceList(HumanResourceParameter humanResourceParameter) {
        return entityManager.createQuery("SELECT h FROM HumanResource h", HumanResource.class).getResultList();
    }

    public Integer getDuplicatedHumanResourceCount(HumanResourceParameter humanResourceParameter) {
        return entityManager.createQuery("SELECT COUNT(h) FROM HumanResource h WHERE h.name = :name", Integer.class)
                .setParameter("name", humanResourceParameter.getName())
                .getSingleResult();
    }

    public List<HumanResource> getHumanResourceListByDepartment(@NotNull String department) {
        return entityManager.createQuery("SELECT h FROM HumanResource h WHERE h.department.teamName = :department", HumanResource.class)
                .setParameter("department", department)
                .getResultList();
    }

    public void updateHumanResourceSalary(long id, @NotNull Salary salary) {
        HumanResource humanResource = entityManager.find(HumanResource.class, id);
        humanResource.setSalary(salary);
        entityManager.merge(humanResource);
    }
}
