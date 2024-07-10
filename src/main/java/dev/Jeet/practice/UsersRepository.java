package dev.Jeet.practice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users,Integer> {
    @Query(value = "SELECT\n" +
            "    id,\n" +
            "    first_name,\n" +
            "    last_name\n" +
            "FROM\n" +
            "    users\n" +
            "WHERE\n" +
            "        user_type = 'CORPORATE'\n" +
            "    AND account_enabled = 'Y'\n" +
            "ORDER BY\n" +
            "    id",nativeQuery = true)
    public List<Users> getUSers();
}
