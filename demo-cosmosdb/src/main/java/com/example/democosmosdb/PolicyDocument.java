package com.example.democosmosdb;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Container(containerName = "DocumentosPoliza3")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
class PolicyDocument {

	@Id
	@GeneratedValue
	private String id;

	@NonNull
	private String firstName;

	@NonNull
	@PartitionKey
	private String lastName;
    
	@NonNull
	private String address;

	private int age;
}
