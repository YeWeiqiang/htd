package cn.bunz.htd.repository;

import cn.bunz.htd.entity.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit, Integer> {

    List<Recruit> findAll();

}
