        input1=input1.toLowerCase();
        String str="";
        for( int i=input1.length()-1;i>=0;i--){
                str+=input1.charAt(i);
        }
        if(str.equals(input1)){
            return 2;
        }
        return 1;
