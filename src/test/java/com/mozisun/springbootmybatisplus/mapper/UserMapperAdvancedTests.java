package com.mozisun.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mozisun.springbootmybatisplus.pojo.User;
import jakarta.annotation.Resource;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * UserMapper 高级用法测试类
 *
 * 包含复杂查询、分页、逻辑删除、乐观锁更新等示例，
 * 演示企业级项目中 MyBatis-Plus 的实用技巧。
 */
@SpringBootTest
public class UserMapperAdvancedTests {

  @Resource
  private UserMapper userMapper;

  /**
   * 复杂条件查询示例：
   * 查询年龄在20到40岁之间，且姓名包含"mo"的用户列表。
   */
  @Test
  public void complexQueryTest() {
    LambdaQueryWrapper<User> query = new LambdaQueryWrapper<>();
    query.between(User::getAge, 20, 40).like(User::getName, "mo");

    List<User> users = userMapper.selectList(query);
    System.out.println("复杂条件查询结果：" + users);
  }

  /**
   * 分页查询示例：
   * 查询第1页，每页5条数据，按年龄降序排序。
   */
  @Test
  public void paginationTest() {
    Page<User> page = new Page<>(1, 5);
    LambdaQueryWrapper<User> query = new LambdaQueryWrapper<>();
    query.orderByDesc(User::getAge);

    IPage<User> resultPage = userMapper.selectPage(page, query);
    System.out.println("分页查询总记录数：" + resultPage.getTotal());
    System.out.println("分页查询当前页数据：" + resultPage.getRecords());
  }

  /**
   * 乐观锁更新示例（需在User实体上配置 @Version 字段）
   * 更新用户的邮箱，演示乐观锁机制防止数据冲突。
   */
  @Test
  public void optimisticLockUpdateTest() {
    User user = userMapper.selectById(1L);
    if (user != null) {
      user.setEmail("lock_test@example.com");
      int updateCount = userMapper.updateById(user);
      System.out.println("乐观锁更新影响行数：" + updateCount);
    }
  }

  /**
   * 逻辑删除示例（需在User实体上配置 @TableLogic 字段）
   * 根据 ID 逻辑删除用户，数据库不物理删除，保证数据安全。
   */
  @Test
  public void logicDeleteTest() {
    int result = userMapper.deleteById(2L);
    System.out.println("逻辑删除影响行数：" + result);
  }

}
