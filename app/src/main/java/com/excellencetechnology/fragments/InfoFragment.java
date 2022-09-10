package com.excellencetechnology.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.excellencetechnology.R;
import com.excellencetechnology.adapters.CodingInfoAdapter;
import com.excellencetechnology.codingActivity;
import com.excellencetechnology.models.InfoData;


public class InfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView LearnlistView, AudilistView, benelistView, SallistView, ReqlistView;
        int pos = codingActivity.position();

        // Java Data
        InfoData[] java_learning = new InfoData[]{
                new InfoData("Core concepts in Java (whilst having fun, too)"),
                new InfoData("How to easily write programs for all computing platforms at once"),
                new InfoData("Knowledge of Java code (+ advanced tips and tricks used by the pros)"),
                new InfoData("The core skills needed to program for big clients, as a travelling freelancer or from home Who is the target audience?"),
        };

        InfoData[] java_audience = new InfoData[]{
                new InfoData("This course is perfect for absolute beginners with no previous coding experience, to intermediates looking to sharpen their skills to the next level"),
                new InfoData("Those looking to build creative and advanced Java apps for either personal use or for high-paying clients as a self-employed contractor"),
                new InfoData("Those who love letting their own creative genius shine, whilst getting paid handsome amounts to do so"),
        };

        InfoData[] java_benefits = new InfoData[]{
                new InfoData("Java is quite popular as a Programming Language in the Industry so you can get good opportunities, if that is what you are looking for."),
                new InfoData("You can use Java to implement any kind of Software. It can be an Enterprise Application, a Website, a Desktop application, a Search Engine or a Gadget. You can say this can be done with any Programming Language, which is quite true."),
                new InfoData("Java is a Secure platform, thanks to its Virtual Machine. This is one of the primary reasons Companies worldwide are using this Language. So it's here to stay."),
                new InfoData("Android App Development is gaining momentum and if you are familiar with Java then learning Android will be easier for you."),
        };

        InfoData[] java_salary = new InfoData[]{
                new InfoData("75000 USD"),
        };

        InfoData[] java_req = new InfoData[]{
                new InfoData("A strong work ethic, willingness to learn, and plenty of excitement about the awesome new programs you're about to build."),
                new InfoData("A strong work ethic, willingness to learn, and plenty of excitement about the awesome new programs you're about to build."),
        };

        // Python Data
        InfoData[] python_learning = new InfoData[]{
                new InfoData("Understand and implement basic Python Code"),
                new InfoData("Solid understanding of python programming  fundamentals such as data types and structures variables, loops, and functions."),
                new InfoData("Create small program with python 2"),

        };

        InfoData[] python_audience = new InfoData[]{
                new InfoData("Complete programming beginners who have never programmed before, or those who want to learn a new language apart from the one they already know."),
                new InfoData("People who want to learn python fundamentals and later transition into Data science, web Development or Big data"),

        };

        InfoData[] python_benefits = new InfoData[]{
                new InfoData("python is one of the most important programming languages and must be part of any programmer's toolset."),
                new InfoData("it provides constructs which allow the developer to create software with fewer lines of code enabling better readability and less complexity"),
                new InfoData("Once you learn python you'll never have a shortage of ways to utilize the skill."),
                new InfoData("Python is popular and widely used"),
        };

        InfoData[] python_salary = new InfoData[]{
                new InfoData("70,000 USD per year"),
        };

        InfoData[] python_req = new InfoData[]{
                new InfoData("A willingness to learn new python skills"),
                new InfoData("No programming experience is required"),
        };

        // HTML Data
        InfoData[] HTML_learning = new InfoData[]{
                new InfoData("write HTML code "),
                new InfoData("To set up HTML documents"),
                new InfoData("Create your own awesome webpage"),
                new InfoData("Format HTML elements"),
        };

        InfoData[] HTML_audience = new InfoData[]{
                new InfoData("Anyone who wants to learn to create websites be it a beginner or intermediate programmer."),
                new InfoData("If you want to start your carrier as a frontend web developer, HTML is a must along with other technologies. "),

        };

        InfoData[] HTML_benefits = new InfoData[]{
                new InfoData("HTML is fun to write and easy to get started with, no need to set up compiler or the environment"),
                new InfoData("Nowadays every business be it small or large needs a website, so there is a lot of opportunity for a web developer"),

        };

        InfoData[] HTML_salary = new InfoData[]{
                new InfoData("40,000 USD per year"),
        };

        InfoData[] HTML_req = new InfoData[]{
                new InfoData("You won't need to know anything before taking this course."),
                new InfoData("Eagerness to learn, and make awesome websites."),
        };

        // CSS Data
        InfoData[] css_learning = new InfoData[]{
                new InfoData("Understand how HTML and CSS work together"),
                new InfoData("Apply CSS styling to HTML elements"),
                new InfoData("Build beautiful websites which don't just contain great content but also look good"),
                new InfoData("Understand the concepts and theory behind CSS and certain CSS features"),
        };

        InfoData[] css_audience = new InfoData[]{
                new InfoData("Anyone who wants to learn CSS for the first time or wants to sharpen his or her CSS skills"),
                new InfoData("HTML beginners"),
                new InfoData("If you want to make beautiful and responsive websites, then this course is a must"),
        };

        InfoData[] css_benefits = new InfoData[]{
                new InfoData("CSS is designed to save you time and we show you how to use it effectively to achieve results"),
                new InfoData("Being able to learn CSS will give you a strong background to learn other web design and app design languages"),
                new InfoData("Web development is required in each an every sector, having CSS in your skill set is a good advantage"),

        };

        InfoData[] css_salary = new InfoData[]{
                new InfoData("40,000 USD per year"),
        };

        InfoData[] css_req = new InfoData[]{
                new InfoData("Should have basic knowledge of HTML and its tags"),
                new InfoData("Having creativity and good taste of color combination is a plus point"),
                new InfoData("nothing else! It's just you, your phone, and hunger to get started today."),
        };

        // JS Data
        InfoData[] javaScript_learning = new InfoData[]{
                new InfoData("Javascript is simple and easy to learn, having a strong understanding of the fundaments of javascript"),
                new InfoData("Work in javascript confidently"),
                new InfoData("Work with variables and strings"),
                new InfoData("Work with numbers in javascript"),
        };

        InfoData[] javascript_audience = new InfoData[]{
                new InfoData("This course is targeted  to beginners who wants to learn basic javascript from scratch"),
                new InfoData("If you want to make your websites interactive then you should go for this course"),
                new InfoData("If you want to start your career as a frontend web developer, javascript will be a good option along with HTML and CSS"),
        };

        InfoData[] javascript_benefits = new InfoData[]{
                new InfoData("The market for javascript is in demand right now in any part of the world."),
                new InfoData("Having a programming language like javascript in your toolset will help you make more money regardless if you are working a regular job or freelancing "),
                new InfoData("Javascript is one of the highest paying programming languages"),

        };

        InfoData[] javascript_salary = new InfoData[]{
                new InfoData("40,000 USD per year"),
        };

        InfoData[] javascript_req = new InfoData[]{
                new InfoData("Basic HTML and CSS"),
                new InfoData("nothing else! It's just you, your phone, and hunger to get started today."),
        };

        // React Data
        InfoData[] react_learning = new InfoData[]{
                new InfoData("React is an open-source mobile application framework created by Facebook, Inc"),
                new InfoData("This course will get you started with the fundaments of React and will make you up and running with cross-platform app development "),
                new InfoData("Creating your first application in react native and understanding the concept of components"),
                new InfoData("Understanding the design process and styling the component"),
                new InfoData("Working with various layouts such as scroll view and list view in native"),
                new InfoData("Handling user interaction and work with buttons events, animations and much more"),
                new InfoData("Understanding the concepts of navigation and getting familiar with something called the router"),
        };

        InfoData[] react_audience = new InfoData[]{
                new InfoData("Students and industry professional who wish to get hands-on an amazing cross platforms app development framework "),
                new InfoData("User who wish to learn cross platforms application development and get into the field of mobile application development"),

        };

        InfoData[] react_benefits = new InfoData[]{
                new InfoData("React is community driven"),
                new InfoData("Maximum code reuse & cost saving "),
                new InfoData("Live reload"),
                new InfoData("Strong performence for mobile enviornments"),
                new InfoData("Modular and inituitive architecture similar to react"),
        };

        InfoData[] react_salary = new InfoData[]{
                new InfoData("117,277 USD per year"),
        };

        InfoData[] react_req = new InfoData[]{
                new InfoData("previous experience with mobile application development will be beneficial"),
                new InfoData("Familiarity with React JS, ES6, and modern javascript is a must"),
        };

        // PHP Data
        InfoData[] php_learning = new InfoData[]{
                new InfoData("Currently you can use the PHP cheats guide and repository of programs given in this course"),
                new InfoData("Practice your code using the compiler available in the course. "),
                new InfoData("The interactive course is under development and it will be made available in the near future"),
        };

        InfoData[] php_audience = new InfoData[]{
                new InfoData("This course is targeted towards beginners who wants to become a backend developer"),
                new InfoData("Anyone who  wants to become a full-stack web developer")

        };

        InfoData[] php_benefits = new InfoData[]{
                new InfoData("PHP is the most popular backend code for the most website you see today "),
                new InfoData("PHP can connect database content to your website, gather form information from the user and a whole lot more"),
                new InfoData("PHP is everywhere from large to small sites learning PHP will help you expand what you can  do with websites "),
        };

        InfoData[] php_salary = new InfoData[]{
                new InfoData("75,000 USD per year"),
        };

        InfoData[] php_req = new InfoData[]{
                new InfoData("Basic knowledge of concepts or terminology used in IT "),
                new InfoData("A strong work ethic, willingness to learn and plenty of excitement about the awesome scripts you are about to write"),
        };

        CodingInfoAdapter adapter;

        switch (pos) {
            case 0:
                adapter = new CodingInfoAdapter(java_learning);
                LearnlistView= view.findViewById(R.id.listView_learn);
                LearnlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                LearnlistView.setHasFixedSize(true);
                LearnlistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(java_audience);
                AudilistView= view.findViewById(R.id.listView_audience);
                AudilistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                AudilistView.setHasFixedSize(true);
                AudilistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(java_benefits);
                benelistView= view.findViewById(R.id.listView_benefits);
                benelistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                benelistView.setHasFixedSize(true);
                benelistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(java_salary);
                SallistView= view.findViewById(R.id.listView_salary);
                SallistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                SallistView.setHasFixedSize(true);
                SallistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(java_req);
                ReqlistView= view.findViewById(R.id.listView_req);
                ReqlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                ReqlistView.setHasFixedSize(true);
                ReqlistView.setAdapter(adapter);
                break;

            case 1:
                adapter = new CodingInfoAdapter(python_learning);
                LearnlistView= view.findViewById(R.id.listView_learn);
                LearnlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                LearnlistView.setHasFixedSize(true);
                LearnlistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(python_audience);
                AudilistView= view.findViewById(R.id.listView_audience);
                AudilistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                AudilistView.setHasFixedSize(true);
                AudilistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(python_benefits);
                benelistView= view.findViewById(R.id.listView_benefits);
                benelistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                benelistView.setHasFixedSize(true);
                benelistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(python_salary);
                SallistView= view.findViewById(R.id.listView_salary);
                SallistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                SallistView.setHasFixedSize(true);
                SallistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(python_req);
                ReqlistView= view.findViewById(R.id.listView_req);
                ReqlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                ReqlistView.setHasFixedSize(true);
                ReqlistView.setAdapter(adapter);
                break;

            case 2:
                adapter = new CodingInfoAdapter(HTML_learning);
                LearnlistView= view.findViewById(R.id.listView_learn);
                LearnlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                LearnlistView.setHasFixedSize(true);
                LearnlistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(HTML_audience);
                AudilistView= view.findViewById(R.id.listView_audience);
                AudilistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                AudilistView.setHasFixedSize(true);
                AudilistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(HTML_benefits);
                benelistView= view.findViewById(R.id.listView_benefits);
                benelistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                benelistView.setHasFixedSize(true);
                benelistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(HTML_salary);
                SallistView= view.findViewById(R.id.listView_salary);
                SallistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                SallistView.setHasFixedSize(true);
                SallistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(HTML_req);
                ReqlistView= view.findViewById(R.id.listView_req);
                ReqlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                ReqlistView.setHasFixedSize(true);
                ReqlistView.setAdapter(adapter);
                break;

            case 3:
                adapter = new CodingInfoAdapter(css_learning);
                LearnlistView= view.findViewById(R.id.listView_learn);
                LearnlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                LearnlistView.setHasFixedSize(true);
                LearnlistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(css_audience);
                AudilistView= view.findViewById(R.id.listView_audience);
                AudilistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                AudilistView.setHasFixedSize(true);
                AudilistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(css_benefits);
                benelistView= view.findViewById(R.id.listView_benefits);
                benelistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                benelistView.setHasFixedSize(true);
                benelistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(css_salary);
                SallistView= view.findViewById(R.id.listView_salary);
                SallistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                SallistView.setHasFixedSize(true);
                SallistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(css_req);
                ReqlistView= view.findViewById(R.id.listView_req);
                ReqlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                ReqlistView.setHasFixedSize(true);
                ReqlistView.setAdapter(adapter);
                break;

            case 4:
                adapter = new CodingInfoAdapter(javaScript_learning);
                LearnlistView= view.findViewById(R.id.listView_learn);
                LearnlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                LearnlistView.setHasFixedSize(true);
                LearnlistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(javascript_audience);
                AudilistView= view.findViewById(R.id.listView_audience);
                AudilistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                AudilistView.setHasFixedSize(true);
                AudilistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(javascript_benefits);
                benelistView= view.findViewById(R.id.listView_benefits);
                benelistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                benelistView.setHasFixedSize(true);
                benelistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(javascript_salary);
                SallistView= view.findViewById(R.id.listView_salary);
                SallistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                SallistView.setHasFixedSize(true);
                SallistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(javascript_req);
                ReqlistView= view.findViewById(R.id.listView_req);
                ReqlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                ReqlistView.setHasFixedSize(true);
                ReqlistView.setAdapter(adapter);
                break;

            case 5:
                adapter = new CodingInfoAdapter(react_learning);
                LearnlistView= view.findViewById(R.id.listView_learn);
                LearnlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                LearnlistView.setHasFixedSize(true);
                LearnlistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(react_audience);
                AudilistView= view.findViewById(R.id.listView_audience);
                AudilistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                AudilistView.setHasFixedSize(true);
                AudilistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(react_benefits);
                benelistView= view.findViewById(R.id.listView_benefits);
                benelistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                benelistView.setHasFixedSize(true);
                benelistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(react_salary);
                SallistView= view.findViewById(R.id.listView_salary);
                SallistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                SallistView.setHasFixedSize(true);
                SallistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(react_req);
                ReqlistView= view.findViewById(R.id.listView_req);
                ReqlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                ReqlistView.setHasFixedSize(true);
                ReqlistView.setAdapter(adapter);
                break;

            case 6:
                adapter = new CodingInfoAdapter(php_learning);
                LearnlistView= view.findViewById(R.id.listView_learn);
                LearnlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                LearnlistView.setHasFixedSize(true);
                LearnlistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(php_audience);
                AudilistView= view.findViewById(R.id.listView_audience);
                AudilistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                AudilistView.setHasFixedSize(true);
                AudilistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(php_benefits);
                benelistView= view.findViewById(R.id.listView_benefits);
                benelistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                benelistView.setHasFixedSize(true);
                benelistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(php_salary);
                SallistView= view.findViewById(R.id.listView_salary);
                SallistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                SallistView.setHasFixedSize(true);
                SallistView.setAdapter(adapter);
                adapter = new CodingInfoAdapter(php_req);
                ReqlistView= view.findViewById(R.id.listView_req);
                ReqlistView.setLayoutManager(new LinearLayoutManager(getContext()));
//                ReqlistView.setHasFixedSize(true);
                ReqlistView.setAdapter(adapter);
                break;

            default:
                break;
        }

    }

}