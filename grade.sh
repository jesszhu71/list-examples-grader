CPATH='.:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar'

rm -rf student-submission
git clone $1 student-submission
echo 'Finished cloning'


cd student-submission
# cp ListExamples.java ./

if [[ -f ListExamples.java ]]
then 
    echo "ListExamples found"
else 
    echo "need file ListExamples"
    exit 1
fi
cd ..
cp student-submission/ListExamples.java ./




# cp ../TestListExample.java ./
javac -cp $CPATH *.java 2> javac-err.txt
# javac TestListExamples.java
if [[ $? -eq 0 ]]
then
    echo "compiled correctly"
else
    echo "error compiling"
    # cat javac-err.txt
fi

java -cp $CPATH org.junit.runner.JUnitCore TestListExamples > java-err.txt
if [[ $? -eq 0 ]]
then 
    echo "passed tests"
else 
    echo "did not pass tests"
    cat java-err.txt
fi


