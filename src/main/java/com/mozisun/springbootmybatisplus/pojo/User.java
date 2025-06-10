package com.mozisun.springbootmybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * 用户实体类
 * <p>
 * 对应数据库中的 `user` 表（使用反引号避免与关键字冲突）
 * 通过 @TableName 明确指定数据库表名，确保映射准确。
 * <p>
 * 使用 Lombok 的 @Data 自动生成 getter/setter、toString、equals 和 hashCode 方法，
 * 简化实体类代码，提高开发效率。
 * <p>
 * 实体类字段与数据库列名默认按驼峰转下划线策略自动映射，如有特殊情况可用 @TableField 注解指定。
 */
@Data
@TableName("`user`")  // 明确映射到数据库表 user
public class User {

  /**
   * 用户主键 ID
   */
  @Version
  private Long id;

  /**
   * 用户姓名
   */
  private String name;

  /**
   * 用户年龄
   */
  private Integer age;

  /**
   * 用户邮箱
   */
  private String email;
}
