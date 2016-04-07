Building
--------

This project uses Maven for building. Common commands:

From the root directory, run ``mvn -PautoInstallPackage clean install`` to build the bundle and content package and install to a CQ instance.

From the root directory, run ``mvn -PautoInstallPackage,full clean install`` to build the bundle and content packages, including content and config packages, and install to a CQ instance.


Demo
----

To view the Demo one need to make next steps:

step init:<br />
``git checkout init``<br />
``mvn -PautoInstallPackage,full clean install``<br />

step 1:<br />
``git checkout step1``<br />
``mvn -PautoInstallPackage clean install``<br />

step 2:<br />
``git checkout step2``<br />
``mvn -PautoInstallPackage clean install``<br />

step 3:<br />
``git checkout step3``<br />
``mvn -PautoInstallPackage clean install``<br />

step 4:<br />
``git checkout step4``<br />
``mvn -PautoInstallPackage clean install``<br />

step 5:<br />
``git checkout step5``<br />
``mvn -PautoInstallPackage clean install``<br />

step done:<br />
``git checkout done``<br />
``mvn -PautoInstallPackage clean install``<br />


