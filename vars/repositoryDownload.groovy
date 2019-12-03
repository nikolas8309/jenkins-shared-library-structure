#!/usr/bin/groovy

def call ()
{
	sh"""
	echo "Clone github repository"
	git clone https://github.com/nikolas8309/jenkins-shared-library-structure.git
	pwd
	ls -al jenkins-shared-library-structure
	"""
}