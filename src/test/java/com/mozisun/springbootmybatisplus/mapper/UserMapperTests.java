package com.mozisun.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mozisun.springbootmybatisplus.pojo.User;
import jakarta.annotation.Resource;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * UserMapper 单元测试类
 */
@SpringBootTest
public class UserMapperTests {

  @Resource
  private UserMapper userMapper;

  /**
   * 根据主键 ID 查询用户示例
   */
  @Test
  public void selectByIdTest() {
    User user = userMapper.selectById(1L);
    Assertions.assertNotNull(user);
    System.out.println("selectById 查询结果：" + user);
  }

  /**
   * 查询所有用户示例
   */
  @Test
  public void selectAllTest() {
    List<User> userList = userMapper.selectList(null);
    Assertions.assertNotNull(userList);
    Assertions.assertFalse(userList.isEmpty());
    Assertions.assertEquals(5, userList.size());
    System.out.println("selectList 查询所有用户结果：" + userList);
  }

  /**
   * 使用条件构造器 QueryWrapper 查询符合条件的用户
   */
  @Test
  public void selectByWrapperTest() {
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    // 构造查询条件：age 大于等于 18 岁
    queryWrapper.ge("age", 18);
    List<User> adults = userMapper.selectList(queryWrapper);
    System.out.println("年龄 >= 18 的用户：" + adults);
  }

  /**
   * 插入新用户示例
   */
  @Test
  public void insertUserTest() {
    User user = new User();
    user.setName("Mozi");
    user.setAge(30);
    user.setEmail("mozi@example.com");
    int rows = userMapper.insert(user);
    System.out.println("插入用户影响行数：" + rows);
    System.out.println("插入后用户 ID：" + user.getId()); // 若数据库自增，ID 会自动回填
  }

  /**
   * 更新用户示例
   */
  @Test
  public void updateUserTest() {
    User user = userMapper.selectById(1L);
    if (user != null) {
      user.setEmail("new_email@example.com");
      int rows = userMapper.updateById(user);
      System.out.println("更新用户影响行数：" + rows);
    }
  }

  /**
   * 根据 ID 删除用户示例
   */
  @Test
  public void deleteUserTest() {
    int rows = userMapper.deleteById(1L);
    System.out.println("删除用户影响行数：" + rows);
  }
}
