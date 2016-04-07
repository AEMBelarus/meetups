Building
--------

This project uses Maven for building. Common commands:

From the root directory, run ``mvn -PautoInstallPackage clean install`` to build the bundle and content package and install to a CQ instance.

From the root directory, run ``mvn -PautoInstallPackage,full clean install`` to build the bundle and content packages, including content and config packages, and install to a CQ instance.



