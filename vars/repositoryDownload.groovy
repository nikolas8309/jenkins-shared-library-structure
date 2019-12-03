#!/usr/bin/groovy

def call ()
{
	sh"""
	echo "Delete old copy of github repository"
	rm -r jenkins-shared-library-structure
	ls -a
	echo "Clone github repository"
	git clone https://github.com/nikolas8309/jenkins-shared-library-structure.git
	ls -al jenkins-shared-library-structure
	"""
}