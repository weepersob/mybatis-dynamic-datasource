package com.mqw.mybatisdbshiftdemo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Tag {
    private Long id;
    private String name;
    private Long useCount;
}
