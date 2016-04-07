Building
--------

This project uses Maven for building. Common commands:

From the root directory, run ``mvn -PautoInstallPackage clean install`` to build the bundle and content package and install to a CQ instance.

From the root directory, run ``mvn -PautoInstallPackage,full clean install`` to build the bundle and content packages, including content and config packages, and install to a CQ instance.


Demo
----

To view the Demo one need to make next steps:

step init: 
``git checkout init``
``mvn -PautoInstallPackage,full clean install``

step 1:
``git checkout step1``
``mvn -PautoInstallPackage clean install``

step 2:
``git checkout step2``
``mvn -PautoInstallPackage clean install``

step 3:
``git checkout step3``
``mvn -PautoInstallPackage clean install``

step 4:
``git checkout step4``
``mvn -PautoInstallPackage clean install``

step 5:
``git checkout step5``
``mvn -PautoInstallPackage clean install``

step done:
``git checkout done``
``mvn -PautoInstallPackage clean install``


