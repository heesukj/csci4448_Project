//package com.stockscore.stockscore_new.web.application;
//
//import com.stockscore.stockscore_new.business.domain.StockFavorite;
//import com.stockscore.stockscore_new.business.service.FavoriteService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.ui.Model;
//
//import java.util.List;
//
///**
// * Created by heesukjang on 12/6/17.
// * Controller - traffic cop that collects the data for the model and passes it
// * to the apropriate view via the template engine => is the piece that all of the
// * coordinating between the model(our data) and the view(what the user sees)
// * => all of the requests respond thru "DispatcherServlet that is mapped to URLs
// * thru the 'request mapping' annotation. The DispatcherServlet uses that request mapping
// * along with the HTTP verb to direct all traffic to a specific method.*/
//
//// the method, geFavoriteForStockTicker(ticker), should be defined in the class FavoriteService
//@Controller
//@RequestMapping(value="/favorite")
//public class FavoriteController {
//
//    @Autowired
//    private FavoriteService favoriteService;
//
//    @RequestMapping(method= RequestMethod.GET)
//    public String getFavorite(@RequestParam(value="stockTicker", required=false)String ticker, Model model) {
//        List<StockFavorite> stockFavoriateList = this.favoriteService.geAllFavorite(ticker);
//        model.addAttribute("stockFavorite", stockFavoriateList);
//        return "favorite";
//    }
//
////    @RequestMapping(method = RequestMethod.GET)
////    public String getFavorite() {
////        return "favorite";
////    }
//}
//
////    @Controller
////    @RequestMapping(value="user")   // url path
////    public class UserController {
////
////        // Rest endpoints that talk to Service
////        // tell Spring to find a component of UserService and use that
////        // one as an instance (not having constructor to instantiate)
////
////        public static final Logger logger = LoggerFactory.getLogger(UserController.class);
////
////        @Autowired
////        private UserRepository userRepository;
////
////        @RequestMapping(method=RequestMethod.GET)
////        public String getUser() {
////            return "user";    //That string is actually going to get translated by the Thymeleaf engine into the name of a template. In our resources directory
////        }
////}
