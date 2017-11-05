package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.utilities

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
class Constants
{
    companion object {
        const val BASE_URL = "https://newsapi.org"
        const val NEWS_API = "/v1/articles?source=bbc-sport&sortBy=top&apiKey="
        const val NEWS_ITEM_KEY = "NEWS_ITEM_KEY"
        const val NEWS_API_KEY = "1957c52a760040b0b59348c87b03075b"
        const val NO_INTERNET = "No internet please check your connection"
        const val PRESNETER_ERROR = "Please call Presenter.attachView(MvpView) before\" + \" requesting data to the Presenter"

        const val JSON_DATA = "{\n" +
                "\t\"status\": \"ok\",\n" +
                "\t\"source\": \"bbc-sport\",\n" +
                "\t\"sortBy\": \"top\",\n" +
                "\t\"articles\": [{\n" +
                "\t\t\"author\": \"BBC Sport\",\n" +
                "\t\t\"title\": \"England: Tammy Abraham, Joe Gomez & Ruben Loftus-Cheek called up\",\n" +
                "\t\t\"description\": \"England call up the uncapped Tammy Abraham, Joe Gomez and Ruben Loftus-Cheek for November's friendlies against Germany and Brazil.\",\n" +
                "\t\t\"url\": \"http://www.bbc.co.uk/sport/football/41848591\",\n" +
                "\t\t\"urlToImage\": \"http://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/1636C/production/_98588909_ipiccy-collage2.jpg\",\n" +
                "\t\t\"publishedAt\": \"2017-11-02T14:33:01Z\"\n" +
                "\t}, {\n" +
                "\t\t\"author\": \"BBC Sport\",\n" +
                "\t\t\"title\": \"Tottenham 3-1 Real Madrid: The result that makes Spurs Champions League contenders?\",\n" +
                "\t\t\"description\": \"Tottenham will take huge self belief from the way they beat champions Real Madrid at Wembley, says Phil McNulty.\",\n" +
                "\t\t\"url\": \"http://www.bbc.co.uk/sport/football/41839988\",\n" +
                "\t\t\"urlToImage\": \"http://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/ADC7/production/_98578444_winkspa.jpg\",\n" +
                "\t\t\"publishedAt\": \"2017-11-02T06:56:47Z\"\n" +
                "\t}, {\n" +
                "\t\t\"author\": \"BBC Sport\",\n" +
                "\t\t\"title\": \"World Series 2017: Houston Astros beat Los Angeles Dodgers for 4-3 series win\",\n" +
                "\t\t\"description\": \"The Houston Astros win their first World Series title by beating the Los Angeles Dodgers 5-1 in the decisive seventh game.\",\n" +
                "\t\t\"url\": \"http://www.bbc.co.uk/sport/baseball/41840152\",\n" +
                "\t\t\"urlToImage\": \"http://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/6399/production/_98579452_george_springer_reuters2.jpg\",\n" +
                "\t\t\"publishedAt\": \"2017-11-02T07:26:34Z\"\n" +
                "\t}, {\n" +
                "\t\t\"author\": \"BBC Sport\",\n" +
                "\t\t\"title\": \"BBL: Dirk Williams' fancy fake & other great plays of the week\",\n" +
                "\t\t\"description\": \"Watch all of the best plays from this week's BBL action, including a fake and finish from Dirk Williams for the Sheffield Sharks.\",\n" +
                "\t\t\"url\": \"http://www.bbc.co.uk/sport/basketball/41849971\",\n" +
                "\t\t\"urlToImage\": \"http://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/17EC4/production/_98588979_p05lv6n1.jpg\",\n" +
                "\t\t\"publishedAt\": \"2017-11-02T14:33:01Z\"\n" +
                "\t}, {\n" +
                "\t\t\"author\": \"BBC Sport\",\n" +
                "\t\t\"title\": \"Marland Yarde: Chris Robshaw says Harlequins in 'better place' without winger\",\n" +
                "\t\t\"description\": \"Harlequins will be \\\"in a better place\\\" without England winger Marland Yarde following his move to Sale, says flanker Chris Robshaw.\",\n" +
                "\t\t\"url\": \"http://www.bbc.co.uk/sport/rugby-union/41842109\",\n" +
                "\t\t\"urlToImage\": \"http://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/105CA/production/_98581076_marland_yarde_reuters.jpg\",\n" +
                "\t\t\"publishedAt\": \"2017-11-02T13:59:32Z\"\n" +
                "\t}, {\n" +
                "\t\t\"author\": \"BBC Sport\",\n" +
                "\t\t\"title\": \"FA Cup first round: Hyde United, The Hitman and Muhammad Ali\",\n" +
                "\t\t\"description\": \"Former world boxing champion Ricky Hatton will be cheering for non-league Hyde United against MK Dons in the FA Cup on Friday.\",\n" +
                "\t\t\"url\": \"http://www.bbc.co.uk/sport/football/41739095\",\n" +
                "\t\t\"urlToImage\": \"http://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/13463/production/_98574987_ricky_hatton1_getty.jpg\",\n" +
                "\t\t\"publishedAt\": \"2017-11-01T22:30:47Z\"\n" +
                "\t}, {\n" +
                "\t\t\"author\": \"BBC Sport\",\n" +
                "\t\t\"title\": \"Manu Tuilagi: Plans to extend Premiership Rugby season are 'ridiculous'\",\n" +
                "\t\t\"description\": \"England and Leicester Tigers centre Manu Tuilagi says he disagrees with Premiership Rugby's 'ridiculous' plans to extend the domestic season.\",\n" +
                "\t\t\"url\": \"http://www.bbc.co.uk/sport/rugby-union/41846081\",\n" +
                "\t\t\"urlToImage\": \"http://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/151B0/production/_98584468_p05lv4j2.jpg\",\n" +
                "\t\t\"publishedAt\": \"2017-11-02T14:33:01Z\"\n" +
                "\t}, {\n" +
                "\t\t\"author\": \"BBC Sport\",\n" +
                "\t\t\"title\": \"Women's Ashes 2017: England add three players to squad before Test\",\n" +
                "\t\t\"description\": \"England call up Kate Cross, Tash Farrant and Amy Jones to their Ashes squad before the Test against Australia in Sydney.\",\n" +
                "\t\t\"url\": \"http://www.bbc.co.uk/sport/cricket/41845318\",\n" +
                "\t\t\"urlToImage\": \"http://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/481A/production/_98585481_kate_cross_getty4.jpg\",\n" +
                "\t\t\"publishedAt\": \"2017-11-02T12:09:46Z\"\n" +
                "\t}, {\n" +
                "\t\t\"author\": \"BBC Sport\",\n" +
                "\t\t\"title\": \"FA Cup: Tottenham's Dele Alli mauls Real Madrid five years on from debut\",\n" +
                "\t\t\"description\": \"Tottenham's Dele Alli scores twice against Real Madrid in the Champions League at Wembley, almost five years to the day from his professional debut as an MK Dons substitute in their FA Cup first round game against Cambridge City.\",\n" +
                "\t\t\"url\": \"http://www.bbc.co.uk/sport/football/41840436\",\n" +
                "\t\t\"urlToImage\": \"http://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/73F7/production/_98578692_p05lrm4z.jpg\",\n" +
                "\t\t\"publishedAt\": \"2017-11-02T14:33:01Z\"\n" +
                "\t}, {\n" +
                "\t\t\"author\": \"BBC Sport\",\n" +
                "\t\t\"title\": \"Sergio Aguero: Why Man City's record-breaking striker is so special - Alan Shearer\",\n" +
                "\t\t\"description\": \"Sergio Aguero is Manchester City's greatest goalscorer - and he is the best striker in the Premier League too, according to Alan Shearer.\",\n" +
                "\t\t\"url\": \"http://www.bbc.co.uk/sport/football/41354958\",\n" +
                "\t\t\"urlToImage\": \"http://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/7FAF/production/_98578623_aguero.jpg\",\n" +
                "\t\t\"publishedAt\": \"2017-11-01T23:12:03Z\"\n" +
                "\t}]\n" +
                "}"
    }
}