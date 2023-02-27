import java.io.IOException;
import java.util.Scanner;

public class callHtmlFilterOne {
    public static void callSanitizeHtml() throws IOException {

        Scanner scanner= new Scanner(System.in);
        // calling the filtering function with the sample html document
        //System.out.println("Enter your HTML source code to be filtered");
        //String originalHtmlCode = scanner.nextLine();
        String originalHtmlCode = " <!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"UTF-8\" />\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                "    <title>Document</title>\n" +
                "    <script src=\"jquery-3.6.0.js\"></script>\n" +
                "    <style>\n" +
                "      * {\n" +
                "        margin: 0;\n" +
                "        padding: 0;\n" +
                "      }\n" +
                "\n" +
                "      ::selection {\n" +
                "        font-weight: 600;\n" +
                "        color: #5b0000;\n" +
                "        background: rgba(31, 79, 23, 0.626);\n" +
                "      }\n" +
                "\n" +
                "      body {\n" +
                "        color: #ffffff;\n" +
                "        background: #011d38;\n" +
                "        align-items: center;\n" +
                "      }\n" +
                "\n" +
                "      .title {\n" +
                "        margin: 12px;\n" +
                "        padding: 8px 0 19px 0;\n" +
                "        height: 100px;\n" +
                "        text-align: center;\n" +
                "      }\n" +
                "\n" +
                "      .menu {\n" +
                "        margin: 18px 0 39px 0;\n" +
                "        padding: 9px;\n" +
                "        text-align: center;\n" +
                "        position: relative;\n" +
                "      }\n" +
                "\n" +
                "      .menu li {\n" +
                "        margin: 7px;\n" +
                "        list-style-type: none;\n" +
                "        display: inline;\n" +
                "      }\n" +
                "\n" +
                "      .menu li a {\n" +
                "        text-align: center;\n" +
                "        padding: 6px;\n" +
                "        text-decoration: none;\n" +
                "        color: aliceblue;\n" +
                "        border: 1px solid #fefefe;\n" +
                "        border-radius: 24px;\n" +
                "      }\n" +
                "\n" +
                "      .menu li a:hover {\n" +
                "        box-shadow: 1px 2px 3px 1px white;\n" +
                "        border-radius: 10px;\n" +
                "      }\n" +
                "\n" +
                "      .explanation,\n" +
                "      .question,\n" +
                "      .HTML-filter {\n" +
                "        margin: 47px;\n" +
                "        padding: 30px;\n" +
                "        color: aliceblue;\n" +
                "        border: #011d38;\n" +
                "        background: linear-gradient(to left top, black, aqua);\n" +
                "      }\n" +
                "\n" +
                "      #buttons {\n" +
                "        margin: 43px;\n" +
                "        padding: 20px;\n" +
                "        color: rgb(6, 255, 251);\n" +
                "        position: relative;\n" +
                "        text-align: center;\n" +
                "      }\n" +
                "      #buttons h2 {\n" +
                "        margin: 22px;\n" +
                "      }\n" +
                "\n" +
                "      .background_changer_button {\n" +
                "        padding: 10px;\n" +
                "        background: rgba(2, 99, 99, 0.682);\n" +
                "        width: 150px;\n" +
                "        color: white;\n" +
                "        border-radius: 24px;\n" +
                "        cursor: pointer;\n" +
                "        transition: all 0.3s;\n" +
                "      }\n" +
                "      .background_changer_button:hover {\n" +
                "        transform: translateY(-4px);\n" +
                "      }\n" +
                "\n" +
                "      .showArea {\n" +
                "        /* the area where the hidden contents are shown */\n" +
                "        display: flex;\n" +
                "        flex-direction: column;\n" +
                "        justify-content: space-around;\n" +
                "        align-items: center;\n" +
                "        position: relative;\n" +
                "        padding: 9px;\n" +
                "        width: fit-content;\n" +
                "        height: fit-content;\n" +
                "        border: 1px solid aqua;\n" +
                "      }\n" +
                "\n" +
                "      .date_and_time {\n" +
                "        color: aliceblue;\n" +
                "        width: 80%;\n" +
                "      }\n" +
                "\n" +
                "      .closeDate {\n" +
                "        position: absolute;\n" +
                "        top: 0;\n" +
                "        right: 0;\n" +
                "        width: 20px;\n" +
                "        color: white;\n" +
                "        background: transparent;\n" +
                "        border: none;\n" +
                "      }\n" +
                "\n" +
                "      .closeDate:hover {\n" +
                "        font-size: 20px;\n" +
                "      }\n" +
                "\n" +
                "      .hidden {\n" +
                "        display: none;\n" +
                "        background: ;\n" +
                "      }\n" +
                "\n" +
                "      .btns {\n" +
                "        margin: 23px;\n" +
                "        padding: 8px;\n" +
                "        width: 230px;\n" +
                "        text-align: center;\n" +
                "        display: inline;\n" +
                "        background: transparent;\n" +
                "        color: rgb(255, 0, 0);\n" +
                "        border: 1px solid rgb(203, 107, 107);\n" +
                "        border-radius: 13px;\n" +
                "      }\n" +
                "\n" +
                "      .btns:hover {\n" +
                "        border: none;\n" +
                "        background-color: black;\n" +
                "        box-shadow: 1px 1px 12px 1px rgb(209, 9, 9);\n" +
                "      }\n" +
                "\n" +
                "      hr {\n" +
                "        width: 850px;\n" +
                "        margin: 23px;\n" +
                "        position: absolute;\n" +
                "        left: 23%;\n" +
                "      }\n" +
                "\n" +
                "      .footer {\n" +
                "        position: relative;\n" +
                "        margin: 8px;\n" +
                "        padding: 20px;\n" +
                "        height: 300px;\n" +
                "        color: aliceblue;\n" +
                "      }\n" +
                "\n" +
                "      .writtings {\n" +
                "        position: absolute;\n" +
                "        padding: 30px;\n" +
                "        top: 40px;\n" +
                "        width: 30%;\n" +
                "      }\n" +
                "\n" +
                "      .about {\n" +
                "        position: absolute;\n" +
                "        right: 170px;\n" +
                "        margin: 11px;\n" +
                "        width: 40%;\n" +
                "      }\n" +
                "\n" +
                "      .about ul {\n" +
                "        margin: 5px;\n" +
                "      }\n" +
                "\n" +
                "      .about li {\n" +
                "        margin: 5px;\n" +
                "        list-style-type: none;\n" +
                "        padding: 4px;\n" +
                "      }\n" +
                "\n" +
                "      .about li::marker {\n" +
                "        content: \"\uD83D\uDCBB\";\n" +
                "      }\n" +
                "\n" +
                "      .about ul li:hover {\n" +
                "        color: aqua;\n" +
                "        text-shadow: 13px 1px 14px white;\n" +
                "        animation-name: abiyo;\n" +
                "        animation-duration: 2s;\n" +
                "      }\n" +
                "      @keyframes abiyo {\n" +
                "        0% {\n" +
                "          opacity: 0;\n" +
                "          transform: translateX(20px);\n" +
                "        }\n" +
                "        100% {\n" +
                "          opacity: 1;\n" +
                "          transform: translateX(0);\n" +
                "        }\n" +
                "      }\n" +
                "\n" +
                "      .contact {\n" +
                "        position: absolute;\n" +
                "        right: 40px;\n" +
                "        margin: 10px;\n" +
                "        padding: 10px;\n" +
                "        text-align: center;\n" +
                "      }\n" +
                "\n" +
                "      .contact p {\n" +
                "        margin: 6px;\n" +
                "      }\n" +
                "      .contact img {\n" +
                "        margin: 5px;\n" +
                "        width: 35px;\n" +
                "        height: 35px;\n" +
                "      }\n" +
                "\n" +
                "      .contact img:hover {\n" +
                "        transform: translateY(10px);\n" +
                "      }\n" +
                "    </style>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <script>\n" +
                "      (function () {\n" +
                "        let createdElement = document.createElement(\"script\");\n" +
                "        createdElement.type = \"text/javascript\";\n" +
                "        createdElement.async = true;\n" +
                "        let scriptValue = document.getElementsByTagName(\"script\")[0];\n" +
                "        scriptValue.parentNode.insertBefore(createdElement, scriptValue);\n" +
                "      })();\n" +
                "    </script>\n" +
                "    <!-- \n" +
                "If there are script tags in the attributes of other tags, strip out only the tags themselves and leave the rest of the attribute's value intact -->\n" +
                "    <!-- Make sure to leave basic markup (fonts, formatting, etc) intact \n" +
                "-->\n" +
                "\n" +
                "    <div class=\"header\">\n" +
                "      <div class=\"header_background\"></div>\n" +
                "      <div class=\"title\">\n" +
                "        <h1>Fundamental Of Software Security Group Assignment</h1>\n" +
                "        <p>\n" +
                "          This is a sample html document, styled with css, which is filtered by\n" +
                "          html-filter. To see the effects of the HTML filter uncommet just the\n" +
                "          last script code (from line 425 to line 430) by removing the\n" +
                "          commenting symbols.\n" +
                "        </p>\n" +
                "      </div>\n" +
                "      <div class=\"menu\">\n" +
                "        <ul>\n" +
                "          <li><a class=\"color_change\" href=\"#\">home</a></li>\n" +
                "          <li><a class=\"color_change\" href=\"#question\">Question</a></li>\n" +
                "          <li><a class=\"color_change\" href=\"#explanation\">Explanation</a></li>\n" +
                "          <li><a class=\"color_change\" href=\"#html_filter\">HTML filter</a></li>\n" +
                "          <li><a class=\"color_change\" href=\"#buttons\">Check Area</a></li>\n" +
                "          <li><a class=\"color_change\" href=\"#who_we_are\">About</a></li>\n" +
                "          <li><a class=\"color_change\" href=\"#here_we_are\">contact</a></li>\n" +
                "        </ul>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <div class=\"main\">\n" +
                "      <div class=\"question color_change\">\n" +
                "        <h2 id=\"question\">Question Number 3</h2>\n" +
                "        <br />\n" +
                "        <p>\n" +
                "          Write an HTML filter that, given an arbitrary HTML document, produces\n" +
                "          an HTML document that will not result in the execution of script if\n" +
                "          loaded into a user’s browser, but leaves “basic markup” (fonts,\n" +
                "          formatting, etc.) intact. Consider the possibility that the input\n" +
                "          document is not well-formed HTML, and also consider browser-specific\n" +
                "          features.\n" +
                "        </p>\n" +
                "      </div>\n" +
                "      <div id=\"buttons\" class=\"color_change\">\n" +
                "        <h2>Check Area For The HTML filter</h2>\n" +
                "        <p>\n" +
                "          The following buttons have diffent effects when they are clicked,\n" +
                "          hovered and ..., these all html event based effects are done with\n" +
                "          script lines (with javeScript).\n" +
                "        </p>\n" +
                "\n" +
                "        <button type=\"button\" class=\"date btns\" onclick=\"getDateAndTime()\">\n" +
                "          ⌚ Show Date and Time\n" +
                "        </button>\n" +
                "\n" +
                "        <button type=\"button\" class=\"btns\" onclick=\"donotShowTime()\">\n" +
                "          &times; Close Date and Time\n" +
                "        </button>\n" +
                "        <button\n" +
                "          type=\"button\"\n" +
                "          class=\"btns color_change\"\n" +
                "          onclick=\"showExplanationForQuestion()\"\n" +
                "        >\n" +
                "          About Question\n" +
                "        </button>\n" +
                "        <button type=\"button\" class=\"btns\" onclick=\"showHtmlFilter()\">\n" +
                "          About HTML filter\n" +
                "        </button>\n" +
                "        <button\n" +
                "          type=\"button\"\n" +
                "          class=\"background_changer_button color_change\"\n" +
                "          onmouseover=\"changeBgWithMouseover()\"\n" +
                "        >\n" +
                "          Change Background\n" +
                "        </button>\n" +
                "        <div class=\"showArea hidden\">\n" +
                "          <p class=\"date_and_time\"></p>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div class=\"explanation hidden color_change\">\n" +
                "        <h2 id=\"explanation\">Explanation Of The Qestion</h2>\n" +
                "        <br />\n" +
                "        <p>\n" +
                "          Writing an HTML filter that can take an arbitrary HTML document as\n" +
                "          input and produce a safe HTML document for a user's browser is a\n" +
                "          difficult task due to the complexity of HTML and the many different\n" +
                "          kinds of browsers in use. As a result, this project requires a deep\n" +
                "          understanding of both HTML and browser-specific features. <br />\n" +
                "          The goal is to create an HTML filter that takes in any valid or\n" +
                "          invalid HTML document as input and produces an output that is safe for\n" +
                "          loading into any browser. The output should preserve all “basic\n" +
                "          markup” (fonts, formatting, etc.) while preventing execution of\n" +
                "          potentially dangerous script. There are two main strategies for\n" +
                "          achieving this: blocking certain elements or validating tag structure.\n" +
                "        </p>\n" +
                "      </div>\n" +
                "      <div class=\"HTML-filter hidden color_change\">\n" +
                "        <h2 id=\"html_filter\">What is HTML filter?</h2>\n" +
                "        <br />\n" +
                "        <p>\n" +
                "          HTML Filters are a feature in web programming languages such as PHP,\n" +
                "          ASP.NET and JSP that provide the ability to sanitize user input and\n" +
                "          protect an application from malicious code injection. HTML filters\n" +
                "          examine user-inputted data for specific characters or strings that\n" +
                "          could be used to execute malicious code and remove them from the data\n" +
                "          before it is stored in a database or displayed in a page.\n" +
                "        </p>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <hr />\n" +
                "    <div class=\"footer color_change\">\n" +
                "      <div class=\"writtings\">\n" +
                "        <p>\n" +
                "          Constracted by 3rd year Software engineering stundets of Bahir Dar\n" +
                "          University.\n" +
                "        </p>\n" +
                "        <p>\n" +
                "          Possible to use this document for learning purpose, No &copy;\n" +
                "          restriction.\n" +
                "        </p>\n" +
                "      </div>\n" +
                "      <div class=\"about color_change\">\n" +
                "        <p id=\"who_we_are\">Constructed By :</p>\n" +
                "        <ul>\n" +
                "          <li class=\"member1\">Abiy Shiferaw</li>\n" +
                "          <li class=\"member2\">Abrham Desalegn</li>\n" +
                "          <li class=\"member3\">Jemal Workie</li>\n" +
                "          <li class=\"member4\">Smachew Gedefaw</li>\n" +
                "          <li class=\"member5\">Solomon Muhye</li>\n" +
                "          <li class=\"member6\">Yordanos Ayenew</li>\n" +
                "        </ul>\n" +
                "      </div>\n" +
                "      <div class=\"contact\">\n" +
                "        <p id=\"here_we_are\">Contact Us</p>\n" +
                "        <a href=\"#\"><img src=\"facebook.png\" alt=\"facebook\" /></a>\n" +
                "        <a\n" +
                "          href=\"https://github.com/sgc93/Fundamentals-of-software-security-prooject\"\n" +
                "          ><img src=\"github.png\" alt=\"GitHub\"\n" +
                "        /></a>\n" +
                "        <a href=\"https://t.me/c/1810013562/7\"\n" +
                "          ><img src=\"telegram.png\" alt=\"telegram\"\n" +
                "        /></a>\n" +
                "        <a href=\"#\"><img src=\"linkedin.png\" alt=\"linkedIn\" /></a>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <script>\n" +
                "      const dateBoard = document.querySelector(\".showArea\");\n" +
                "      const datefinder = document.querySelector(\".date_date_time\");\n" +
                "      const close = document.querySelectorAll(\".close\");\n" +
                "      const showExplanation = document.querySelector(\".explanation\");\n" +
                "      const showDescriptionAboutFilter = document.querySelector(\".HTML-filter\");\n" +
                "      const changedBg = document.querySelectorAll(\"color_changer\");\n" +
                "      const getDateAndTime = function () {\n" +
                "        dateBoard.classList.remove(\"hidden\");\n" +
                "        dateBoard.querySelector(\n" +
                "          \".date_and_time\"\n" +
                "        ).textContent = `Now it is ${Date()}`;\n" +
                "      };\n" +
                "      const showExplanationForQuestion = function () {\n" +
                "        showExplanation.classList.remove(\"hidden\");\n" +
                "      };\n" +
                "      const donotShowTime = function () {\n" +
                "        dateBoard.classList.add(\"hidden\");\n" +
                "      };\n" +
                "      const showHtmlFilter = function () {\n" +
                "        showDescriptionAboutFilter.classList.remove(\"hidden\");\n" +
                "      };\n" +
                "\n" +
                "      // background change\n" +
                "\n" +
                "      const changeBgWithMouseover = function () {\n" +
                "        document.querySelector(\"body\").style.backgroundColor = \"#373e78\";\n" +
                "        document.querySelector(\"body\").style.color = \"#000f1d\";\n" +
                "      };\n" +
                "      const chageBgWithClick = function () {\n" +
                "        con;\n" +
                "      };\n" +
                "      console.log(changedBg);\n" +
                "    </script>\n" +
                "\n" +
                "    <!--\n" +
                "This is a basic HTML filter that will remove all script tags from an HTML document. It will also remove any event attributes (onclick, onmouseover, etc.) from tags to prevent any script from being executed.\n" +
                "-->\n" +
                "    <!-- <script>\n" +
                "      //remove all script tags\n" +
                "      $(\"script\").remove();\n" +
                "      //remove all event attributes\n" +
                "      $(\"*\").removeAttr(\"onclick onmouseover onload\");\n" +
                "    </script> -->\n" +
                "  </body>\n" +
                "</html>\n  ";
        // truncated for brevity

        // get the filtered HTML code
        String filteredHtmlCode = HtmlFilterOne.sanitizeHtml(originalHtmlCode);
        System.out.println("The filtered HTML sourced code is: ");
        System.out.println(filteredHtmlCode);
    }
}
