To make the jar:
1. Go to the project directory.
2. Use maven command: mvn package

To start the program:
1. Go to the target directory.
2. Run the jar, using: java -jar jar_name triangle_sides (etc.: java -jar triangleChallenge-1.0-SNAPSHOT.jar 2 3 4)

Code explanation:
1. Two main classes: TriangleCalculator and TriangleValidator
2. TriangleValidator is separate, because client might ask for only bigger or smaller triangles, so all the code would
   go there and be in a one place.
3. TriangleCalculator is responsible for what type of triangle it is. I created separate methods for longer equations,
   just so it would be easier to read code.
4. Enums go to separate package, because they are enums.
5. Tests go to separate package, because they are tests.
6. @Test names follow naming convention: methodName_whatIsHappening[_whatIsTheEndResult]
