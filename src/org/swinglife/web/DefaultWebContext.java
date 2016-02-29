package org.swinglife.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * 系统默认对IWebContext实现
 * User: lxd
 * Date: 2010-12-26
 * Time: 19:18:16
 */
public class DefaultWebContext implements IWebContext {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;


    public HttpServletResponse getResponse() {
        return response;
    }


    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpSession getSession() {
        return session;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    }

    public void setSessionAttr(String key, Object value) {
        if (session != null) {
            session.setAttribute(key, value);
        }
    }

    public Object getSessionAttr(String key) {
        if (session != null) {
            return session.getAttribute(key);
        }
        return null;
    }

    public void removeSessionAttr(String key) {
        if (session != null) {
            session.removeAttribute(key);
        }
    }

    public void setRequestAttr(String key, Object value) {
        if (request != null) {
            request.setAttribute(key, value);
        }
    }

    public Object getRequestAttr(String key) {
        if (request != null) {
            request.getAttribute(key);
        }
        return null;
    }

    public void removeRequestAttr(String key) {
        if (request != null) {
            request.removeAttribute(key);
        }
    }

    @Override
    public String getHost() {
        if(request!=null){
            return request.getRemoteHost();
        }
        return null;
    }

    @Override
    public String getRemoteAddr() {
        if(request!=null){
            return request.getRemoteAddr();
        }
        return null;
    }

    @Override
    public Cookie getCookie(String cookieName) {
        if(getCookies()!=null){
            for (Cookie c:getCookies()){
                if(c.getName().equalsIgnoreCase(cookieName)){
                    return c;
                }
            }
        }
        return null;
    }

    @Override
    public String getCookieValue(String cookieName) {
        Cookie cookie = getCookie(cookieName);
        return cookie==null?"":cookie.getValue();
    }

    @Override
    public Cookie[] getCookies() {
        return request.getCookies();
    }

    @Override
    public void setCookie(Cookie c) {
        response.addCookie(c);
    }

    @Override
    public void expireCookie(String cookieName) {
        Cookie cookie = getCookie(cookieName);
        if(cookie!=null){
            cookie.setMaxAge(-1);
            response.addCookie(cookie);
        }
    }

    /*@Override
    public void setFrontEndUser(CuUserExtend user) {
        Assert.notNull(user,"CuUserExtend can not be null");
        setSessionAttr(Global.FRONT_END_USER, user);
    }
    @Override
    public CuUserExtend getFrontEndUser() {
        return (CuUserExtend)getSessionAttr(Global.FRONT_END_USER);
    }
*/
   /* @Override
    public String getAccount() {
        Cookie cookie = getCookie(Global.LOGIN_ACCOUNT);
        if(cookie!=null){
            if(cookie.getValue()!=null){
                try {
                    return URLDecoder.decode(cookie.getValue(), "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            return null;
            //return cookie.getValue();
        }
        return null;
    }

    @Override
    public void setAccount(HttpServletRequest request, CuUserExtend cuUserExtend) {
        Cookie cookie = null;
        try {
            cookie = new Cookie(Global.LOGIN_ACCOUNT, URLEncoder.encode(CommonUtil.getName(cuUserExtend), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //Cookie cookie = new Cookie(Global.LOGIN_ACCOUNT, CommonUtil.getName(cuUserExtend));
        cookie.setMaxAge(60 * 60 * 24 * 30 * 1);
        String path = request.getContextPath();
        cookie.setPath((path == null || path.length()==0) ? "/" : path);
        response.addCookie(cookie);
    }

    @Override
    public void removeAccount(HttpServletRequest request) {
        Cookie cookie = new Cookie(Global.LOGIN_ACCOUNT,null);
        cookie.setMaxAge(0);
        String path = request.getContextPath();
        cookie.setPath((path == null || path.length()==0) ? "/" : path);
        response.addCookie(cookie);
    }

    @Override
    public void setAgentFrontEndUser(AgentAccountVo user) {
        Assert.notNull(user,"AgentAccountVo can not be null");
        setSessionAttr(Global.AGENT_FRONT_END_USER, user);
    }

    @Override
    public AgentAccountVo getAgentFrontEndUse() {
        return (AgentAccountVo)getSessionAttr(Global.AGENT_FRONT_END_USER);
    }
*/

}
