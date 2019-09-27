package com.trp;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
       List<String> allPaths =  Files.readAllLines(
                Paths.get(Main.class.getResource("input.txt").toURI()), Charset.defaultCharset());

        /* TODO
           Line 15 creates an List of files with their fully qualified path (reading the contents of input.txt)

           Sample Input (from input.txt)
           =============================
           /project/src/main/resources/application.properties
           /project/src/main/java/com/trp/ops/wf/dto/OpsServiceInfo.java
           ... more

           Use the data to create a directory tree. Create a "walk" method (hint : use recursion) that traverses the tree and outputs its
           content as shown below.

           SAMPLE EXPECTED OUTPUT
           ======================
                project
                    src
                        main
                            resources
                                application.properties
                            java
                                com
                                    trp
                                        ops
                                            wf
                                                dto
                                                    OpsServiceInfo.java
                                                    BasicResponse.java
                                                    ResponsePage.java
                                                    OpsServiceMappingInfo.java
                                                    ListOpsServiceRuntimeInfo.java
                                                    mapper
                                                        DTOMapper.java
                                                    PaginatedResponse.java
                                                    bpmn
                                                        WorkflowProcessDefinition.java
                                                        WorkflowActivity.java

                                                        .... more .....


         */

    }
}
