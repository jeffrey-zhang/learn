import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class DataParser {
    public static void main(String[] args) {
        ArrayList<Data> aldata = new ArrayList<Data>();
        try (FileReader fileReader = new FileReader("QueryETSWithUserName_2020-07-08_2020-09-18.csv");
                BufferedReader bfr = new BufferedReader(fileReader);) {
            String line = new String();
            //int i =0;
            while ((line = bfr.readLine()) != null) {
                String[] words= line.split(",");
                aldata.add(new Data(words));
                //i++;
                //System.out.println("col="+ i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find the file...");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for(Data data : aldata){
            System.out.println(data.toString());
        }
    }

    
}

class Data{
    private String Time;
    private String Region;
    private String UserName;
    private String ETSMember;
    private String ETSServiceAuto;
    private String ETSQuestionAuto;
    private String AnswerHit;
    private String ETSQuesionManual;
    private String UserSays;
    private String UserSaysLower;
    private String JARVISAnswerKB;
    private String KBpageId;
    private String KBurl;
    private String KBWikiPosition;
    private String JARVISAnswerForm;
    private String SessionId;

    public Data(String time, String region, String userName, String eTSMember, String eTSServiceAuto,
            String eTSQuestionAuto, String answerHit, String eTSQuesionManual, String userSays,
            String userSaysLower, String jARVISAnswerKB, String kBpageId, String kBurl, String kBWikiPosition,
            String jARVISAnswerForm, String sessionId) {
        Time = time;
        Region = region;
        UserName = userName;
        ETSMember = eTSMember;
        ETSServiceAuto = eTSServiceAuto;
        ETSQuestionAuto = eTSQuestionAuto;
        AnswerHit = answerHit;
        ETSQuesionManual = eTSQuesionManual;
        UserSays = userSays;
        UserSaysLower = userSaysLower;
        JARVISAnswerKB = jARVISAnswerKB;
        KBpageId = kBpageId;
        KBurl = kBurl;
        KBWikiPosition = kBWikiPosition;
        JARVISAnswerForm = jARVISAnswerForm;
        SessionId = sessionId;
    }

    public Data(String[] data){
        if(data != null && data.length ==16){
            Time = data[0].toString();
            Region = data[1].toString();
            UserName = data[2].toString();
            ETSMember = data[3].toString();
            ETSServiceAuto = data[4].toString();
            ETSQuestionAuto = data[5].toString();
            AnswerHit = data[6].toString();
            ETSQuesionManual = data[7].toString();
            UserSays = data[8].toString();
            UserSaysLower = data[9].toString();
            JARVISAnswerKB = data[10].toString();
            KBpageId = data[11].toString();
            KBurl = data[12].toString();
            KBWikiPosition = data[13].toString();
            JARVISAnswerForm = data[14].toString();
            SessionId = data[15].toString();
        }
    }
    
    @Override
    public String toString() {
        return "Data [AnswerHit=" + AnswerHit + ", ETSMember=" + ETSMember + ", ETSQuesionManual="
                + ETSQuesionManual + ", ETSQuestionAuto=" + ETSQuestionAuto + ", ETSServiceAuto=" + ETSServiceAuto
                + ", JARVISAnswerForm=" + JARVISAnswerForm + ", JARVISAnswerKB=" + JARVISAnswerKB
                + ", KBWikiPosition=" + KBWikiPosition + ", KBpageId=" + KBpageId + ", KBurl=" + KBurl + ", Region="
                + Region + ", SessionId=" + SessionId + ", Time=" + Time + ", UserName=" + UserName + ", UserSays="
                + UserSays + ", UserSaysLower=" + UserSaysLower + "]";
    }
}