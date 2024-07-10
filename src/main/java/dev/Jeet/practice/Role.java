package dev.Jeet.practice;
import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="Role")
public class Role {
    @Id
    Integer RoleId;
    @Column(name="creat_usr_id")
    Integer CreatedById;
    @Column(name="creat_usr_ts")
    Date CreatedTimeStamp;
    @Column(name="lst_updt_usr_id")
    Integer UpdateById;
    @Column(name="lst_updt_ts")
    Date UpdatedTimeStamp;
    @Column(name="role_nm")
    String roleName;

    public Role(Integer roleId, Integer createdById, Date createdTimeStamp, Integer updateById, Date updatedTimeStamp, String roleName) {
        RoleId = roleId;
        CreatedById = createdById;
        CreatedTimeStamp = createdTimeStamp;
        UpdateById = updateById;
        UpdatedTimeStamp = updatedTimeStamp;
        this.roleName = roleName;
    }

    public Role() {
    }

    public Integer getRoleId() {
        return RoleId;
    }

    public void setRoleId(Integer roleId) {
        RoleId = roleId;
    }

    public Integer getCreatedById() {
        return CreatedById;
    }

    public void setCreatedById(Integer createdById) {
        CreatedById = createdById;
    }

    public Date getCreatedTimeStamp() {
        return CreatedTimeStamp;
    }

    public void setCreatedTimeStamp(Date createdTimeStamp) {
        CreatedTimeStamp = createdTimeStamp;
    }

    public Integer getUpdateById() {
        return UpdateById;
    }

    public void setUpdateById(Integer updateById) {
        UpdateById = updateById;
    }

    public Date getUpdatedTimeStamp() {
        return UpdatedTimeStamp;
    }

    public void setUpdatedTimeStamp(Date updatedTimeStamp) {
        UpdatedTimeStamp = updatedTimeStamp;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(RoleId, role.RoleId) && Objects.equals(CreatedById, role.CreatedById) && Objects.equals(CreatedTimeStamp, role.CreatedTimeStamp) && Objects.equals(UpdateById, role.UpdateById) && Objects.equals(UpdatedTimeStamp, role.UpdatedTimeStamp) && Objects.equals(roleName, role.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RoleId, CreatedById, CreatedTimeStamp, UpdateById, UpdatedTimeStamp, roleName);
    }
}

