#!/usr/bin/groovy

sh"""
echo "Clone github repository"
git clone https://github.com/nikolas8309/jenkins-shared-library-structure.git
ls -al jenkins-shared-library-structure
"""