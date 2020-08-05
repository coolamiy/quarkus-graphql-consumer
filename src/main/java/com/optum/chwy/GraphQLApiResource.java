package com.optum.chwy;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

/**
 * @author Amit Dixit
 */
@GraphQLApi

public class GraphQLApiResource {
    @Query("findalldata")
    @Description("find all products data")
    public List<String> getProducts() {
        // you can simulate backend calls here to return the data graphql will fire only the required fields query and can be bounded to the schema.
        // @Muatition used for mutating data (create,update and delete operations).
        return List.of("test","test1","test2");

    }
}
