package come.msa.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import come.msa.exception.MyException;

@Controller
public class CustomErrorController implements ErrorController{
	private static final String ERROR_PATH = "/error";
	 
    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
    
    @RequestMapping("/error")
    public ModelAndView handleError(HttpServletRequest request, Model model) {
    	System.out.println("dd");
    	Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        HttpStatus httpStatus = HttpStatus.valueOf(Integer.valueOf(status.toString())); 
    	ModelAndView view = new ModelAndView("exception");
		view.addObject("error_msg", status.toString() + " " + httpStatus.getReasonPhrase());
        return view;
    }
}