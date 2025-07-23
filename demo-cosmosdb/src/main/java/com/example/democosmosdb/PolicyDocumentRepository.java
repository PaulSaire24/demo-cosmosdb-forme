package com.example.democosmosdb;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;

interface PolicyDocumentRepository extends ReactiveCosmosRepository<PolicyDocument, String> {

}
