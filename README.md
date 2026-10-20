# medlemsregister-camp-tree
## Ett problem vi löste
Vi ändrade samma println-rad i src/Main.java på två olika feature-grenar.
När den första grenen mergades spärrade GitHub den andra med en merge-konflikt.
Genom att köra git pull origin main på grenen fick vi ner staketen lokalt.
Vi granskade koden mellan <<<<<<< HEAD och >>>>>>> origin/main, valde en gemensam
text och städade bort markörerna. Efter att ha verifierat med javac avslutade vi
mergen med git add och git commit.