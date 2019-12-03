#!/usr/bin/groovy

def call ()
{
	sh"""
	echo "Clone github repository"
	pwd
	git clone https://github.com/nikolas8309/jenkins-shared-library-structure.git
	ls -al jenkins-shared-library-structure
	"""
}