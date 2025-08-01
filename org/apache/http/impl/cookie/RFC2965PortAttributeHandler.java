package org.apache.http.impl.cookie;

import java.util.StringTokenizer;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;

@Deprecated
public class RFC2965PortAttributeHandler implements CookieAttributeHandler {
    private static int[] parsePortAttribute(String str) throws MalformedCookieException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                int parseInt = Integer.parseInt(stringTokenizer.nextToken().trim());
                iArr[i] = parseInt;
                if (parseInt >= 0) {
                    i++;
                } else {
                    throw new MalformedCookieException("Invalid Port attribute.");
                }
            } catch (NumberFormatException e) {
                throw new MalformedCookieException("Invalid Port attribute: " + e.getMessage());
            }
        }
        return iArr;
    }

    private static boolean portMatch(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            int port = cookieOrigin.getPort();
            if (!(cookie instanceof ClientCookie) || !((ClientCookie) cookie).containsAttribute(ClientCookie.PORT_ATTR)) {
                return true;
            }
            return cookie.getPorts() != null && portMatch(port, cookie.getPorts());
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (setCookie instanceof SetCookie2) {
            SetCookie2 setCookie2 = (SetCookie2) setCookie;
            if (str != null && str.trim().length() > 0) {
                setCookie2.setPorts(parsePortAttribute(str));
            }
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            int port = cookieOrigin.getPort();
            if ((cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.PORT_ATTR) && !portMatch(port, cookie.getPorts())) {
                throw new MalformedCookieException("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
