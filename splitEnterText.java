private String splitTagline(String tagline){
        StringBuilder stringBuilderTag = new StringBuilder();
        Scanner scanner = new Scanner(tagline);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            stringBuilderTag.append("[C]"+line+"\n");
        }

        return stringBuilderTag.toString();
 }
