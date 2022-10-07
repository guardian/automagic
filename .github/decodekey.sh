#!/bin/bash -e

echo $PGP_SECRET | base64 --decode | gpg  --batch --import
mkdir -p ~/.sbt/1.0
echo "credentials += Credentials(\"Sonatype Nexus Repository Manager\", \"oss.sonatype.org\", \"${SONATYPE_USERNAME}\", \"${SONATYPE_PASSWORD}\")" > ~/.sbt/1.0/sonatype.sbt
