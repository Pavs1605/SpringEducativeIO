## Details about Maven :
 * Plugins are nothing but code that implement the logic to perform various tasks during the build process.
 * A Maven plugin consists of goals which is a unit of work. You can think of it as representing the capability of a plugin. A goal is an action we want to take on the project defined by a POM
   * Ex - mvn help:describe -Dplugin=org.apache.maven.plugins:maven-compiler-plugin
   * To get in detail - mvn help:describe -Dplugin=org.apache.maven.plugins:maven-compiler-plugin -Ddetail
* The POM file for a project defines the list of projects the current one depends on.
  * How can we uniquely identify them - Maven makes this possible through a combination of fields defined in a POM file called the Maven coordinates.
  * These are:
    * groupId: This can be the group, company, or department responsible for creating the project. The convention is to use the domain name in reverse order. For instance, for our company the groupdId would be io.datajek. 
    * artifactId: A unique name for the project under the groupId. A team in your company that produces several jar libraries for other teams to consume will have a unique artifactId for each library, but the same groupId. 
    * version: The version specifies a particular release of the project. Imagine your team releases improvements to a particular library on a quarterly basis, each release would get a different version number.
    * Ex :
     ```xml
    <groupId>io.tester</groupId>
      <artifactId>maven-course</artifactId>
      <version>1.0-SNAPSHOT</version>

    <groupId>io.tester</groupId>
    <artifactId>java-course</artifactId>
    <version>2.0-SNAPSHOT</version>
    ```
    
    * Together these three attributes uniquely identify a project. No two projects can have the same values for all three attributes.
    * Maven coordinates are expressed in the following format using colons as the delimiter:  groupId:artifactId:packaging:version (Packaging can be jar or war)
* Local and remote repository
  * Local - <username>/.m2/repository or ~/.m2/repository. 
  * Central repo - https://repo1.maven.org/maven2/.