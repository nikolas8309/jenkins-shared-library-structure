#!/usr/bin/groovy

def call ()
{
	sh"""
	echo "Delete old copy of github repository"
	rm -r jenkins-shared-library-structure || true
	ls -a
	echo "Clone github repository"
	git clone https://github.com/nikolas8309/jenkins-shared-library-structure.git
	chmod -R 755 ./jenkins-shared-library-structure/bin
	ls -al jenkins-shared-library-structure
	"""
}