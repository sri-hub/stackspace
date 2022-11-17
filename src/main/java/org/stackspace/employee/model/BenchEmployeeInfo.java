package org.stackspace.employee.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel
@Data
@NoArgsConstructor
public class BenchEmployeeInfo {

	private int empId;

	private float experience;

	private String skills;

}
