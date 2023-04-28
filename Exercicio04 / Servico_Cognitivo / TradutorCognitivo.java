import com.microsoft.azure.cognitiveservices.translator.*;
import com.microsoft.azure.cognitiveservices.translator.models.*;

public class TradutorCognitivo 
{
    public static void main (String [] args) 
	{
        String endpoint = https://api.cognitive.microsofttranslator.com/;
        String key = String key = "c5262cf2e62841e6a745720aad962333";

        TranslatorTextAPI client = TranslatorTextManager.authenticate (endpoint, key);

        String textToTranslate = "Hello, world!";
        TranslateOptions options = new TranslateOptions ().withText (textToTranslate).withTo ("es");
        TranslationResult result = client.translations ().translate (options);

        System.out.println ("Texto original: " + textToTranslate);
        System.out.println ("Tradução para o espanhol: " + result.getTranslations().get(0).getText());
    }
}
