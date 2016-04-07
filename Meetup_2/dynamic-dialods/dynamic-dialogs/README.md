Building
--------

This project uses Maven for building. Common commands:

From the root directory, run ``mvn -PautoInstallPackage clean install`` to build the bundle and content package and install to a CQ instance.

From the root directory, run ``mvn -PautoInstallPackage,full clean install`` to build the bundle and content packages, including content and config packages, and install to a CQ instance.


Demo
----

To view the Demo one need to make next steps:

step init:\s\s
``git checkout init``\s\s
``mvn -PautoInstallPackage,full clean install``\s\s

step 1:\s\s
``git checkout step1``\s\s
``mvn -PautoInstallPackage clean install``\s\s

step 2:\s\s
``git checkout step2``\s\s
``mvn -PautoInstallPackage clean install``\s\s

step 3:\s\s
``git checkout step3``\s\s
``mvn -PautoInstallPackage clean install``\s\s

step 4:\s\s
``git checkout step4``\s\s
``mvn -PautoInstallPackage clean install``\s\s

step 5:\s\s
``git checkout step5``\s\s
``mvn -PautoInstallPackage clean install``\s\s

step done:\s\s
``git checkout done``\s\s
``mvn -PautoInstallPackage clean install``\s\s


