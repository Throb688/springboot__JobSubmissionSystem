package com.itsnake.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {

    private Integer id;
    private String username;
    private String password;
}
