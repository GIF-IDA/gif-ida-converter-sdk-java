#*******************************************************************************
# Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
#  
# Contributors:
#    Martin Fluegge - initial API and implementation and/or initial documentation
#  
#*******************************************************************************
#!/bin/bash

mvn clean 
mvn compile
mvn compile -P generateSources

if [ $? -ne 0 ]
then
echo "ERROR copying and generating sources. Stopped execution"

exit 1
fi

mvn install -P postProcessSources
