package behavioral.chainOfResponsibility;

/**
 *  want to implement Logging
 *  3 types of logging --> INFO, DEBUG , ERROR
 *  DEBUG is the highest level that means you want to log INFO as well as ERROR along with DEBUG
 *  DEBUG 3 INFO 1 ERROR 2
 *  Example ServletFilter
 *  Handler Interface ---> Concrete Handlers (These handler will have relationship to each other-->
 *  When one handler completes the work, check for another handler and pass to another)
 */
public class COR {
}
