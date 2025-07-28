package org.json;

import java.io.Reader;
import java.util.HashMap;

public class XMLTokener extends JSONTokener {
    public static final HashMap<String, Character> entity;

    static {
        HashMap<String, Character> hashMap = new HashMap<>(8);
        entity = hashMap;
        hashMap.put("amp", XML.AMP);
        hashMap.put("apos", XML.APOS);
        hashMap.put("gt", XML.GT);
        hashMap.put("lt", XML.LT);
        hashMap.put("quot", XML.QUOT);
    }

    public XMLTokener(Reader reader) {
        super(reader);
    }

    public static String unescapeEntity(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (str.charAt(0) == '#') {
            return new String(new int[]{str.charAt(1) == 'x' ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str.substring(1))}, 0, 1);
        }
        Character ch = entity.get(str);
        if (ch != null) {
            return ch.toString();
        }
        return "&" + str + ';';
    }

    public String nextCDATA() throws JSONException {
        StringBuilder sb = new StringBuilder();
        while (more()) {
            sb.append(next());
            int length = sb.length();
            int i = length - 3;
            if (i >= 0 && sb.charAt(i) == ']' && sb.charAt(length - 2) == ']' && sb.charAt(length - 1) == '>') {
                sb.setLength(i);
                return sb.toString();
            }
        }
        throw syntaxError("Unclosed CDATA");
    }

    public Object nextContent() throws JSONException {
        char next;
        do {
            next = next();
        } while (Character.isWhitespace(next));
        if (next == 0) {
            return null;
        }
        if (next == '<') {
            return XML.LT;
        }
        StringBuilder sb = new StringBuilder();
        while (next != 0) {
            if (next == '<') {
                back();
                return sb.toString().trim();
            }
            if (next == '&') {
                sb.append(nextEntity(next));
            } else {
                sb.append(next);
            }
            next = next();
        }
        return sb.toString().trim();
    }

    public Object nextEntity(char c) throws JSONException {
        char next;
        StringBuilder sb = new StringBuilder();
        while (true) {
            next = next();
            if (!Character.isLetterOrDigit(next) && next != '#') {
                break;
            }
            sb.append(Character.toLowerCase(next));
        }
        if (next == ';') {
            return unescapeEntity(sb.toString());
        }
        throw syntaxError("Missing ';' in XML entity: &" + sb);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object nextMeta() throws org.json.JSONException {
        /*
            r6 = this;
        L_0x0000:
            char r0 = r6.next()
            boolean r1 = java.lang.Character.isWhitespace(r0)
            if (r1 != 0) goto L_0x0000
            if (r0 == 0) goto L_0x0064
            r1 = 39
            if (r0 == r1) goto L_0x0052
            r2 = 47
            if (r0 == r2) goto L_0x004f
            r3 = 33
            if (r0 == r3) goto L_0x004c
            r4 = 34
            if (r0 == r4) goto L_0x0052
            switch(r0) {
                case 60: goto L_0x0049;
                case 61: goto L_0x0046;
                case 62: goto L_0x0043;
                case 63: goto L_0x0040;
                default: goto L_0x001f;
            }
        L_0x001f:
            char r0 = r6.next()
            boolean r5 = java.lang.Character.isWhitespace(r0)
            if (r5 == 0) goto L_0x002c
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L_0x002c:
            if (r0 == 0) goto L_0x003a
            if (r0 == r1) goto L_0x003a
            if (r0 == r2) goto L_0x003a
            if (r0 == r3) goto L_0x003a
            if (r0 == r4) goto L_0x003a
            switch(r0) {
                case 60: goto L_0x003a;
                case 61: goto L_0x003a;
                case 62: goto L_0x003a;
                case 63: goto L_0x003a;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x001f
        L_0x003a:
            r6.back()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L_0x0040:
            java.lang.Character r6 = org.json.XML.QUEST
            return r6
        L_0x0043:
            java.lang.Character r6 = org.json.XML.GT
            return r6
        L_0x0046:
            java.lang.Character r6 = org.json.XML.EQ
            return r6
        L_0x0049:
            java.lang.Character r6 = org.json.XML.LT
            return r6
        L_0x004c:
            java.lang.Character r6 = org.json.XML.BANG
            return r6
        L_0x004f:
            java.lang.Character r6 = org.json.XML.SLASH
            return r6
        L_0x0052:
            char r1 = r6.next()
            if (r1 == 0) goto L_0x005d
            if (r1 != r0) goto L_0x0052
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L_0x005d:
            java.lang.String r0 = "Unterminated string"
            org.json.JSONException r6 = r6.syntaxError(r0)
            throw r6
        L_0x0064:
            java.lang.String r0 = "Misshaped meta tag"
            org.json.JSONException r6 = r6.syntaxError(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.XMLTokener.nextMeta():java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        throw syntaxError("Bad character in a name");
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[LOOP_START, PHI: r0 
      PHI: (r0v4 char) = (r0v0 char), (r0v5 char) binds: [B:12:0x001f, B:26:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object nextToken() throws org.json.JSONException {
        /*
            r7 = this;
        L_0x0000:
            char r0 = r7.next()
            boolean r1 = java.lang.Character.isWhitespace(r0)
            if (r1 != 0) goto L_0x0000
            if (r0 == 0) goto L_0x009f
            r1 = 39
            if (r0 == r1) goto L_0x0076
            r2 = 47
            if (r0 == r2) goto L_0x0073
            r3 = 33
            if (r0 == r3) goto L_0x0070
            r4 = 34
            if (r0 == r4) goto L_0x0076
            switch(r0) {
                case 60: goto L_0x0069;
                case 61: goto L_0x0066;
                case 62: goto L_0x0063;
                case 63: goto L_0x0060;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L_0x0024:
            r5.append(r0)
            char r0 = r7.next()
            boolean r6 = java.lang.Character.isWhitespace(r0)
            if (r6 == 0) goto L_0x0036
            java.lang.String r7 = r5.toString()
            return r7
        L_0x0036:
            if (r0 == 0) goto L_0x005b
            if (r0 == r1) goto L_0x0054
            if (r0 == r2) goto L_0x004c
            r6 = 91
            if (r0 == r6) goto L_0x004c
            r6 = 93
            if (r0 == r6) goto L_0x004c
            if (r0 == r3) goto L_0x004c
            if (r0 == r4) goto L_0x0054
            switch(r0) {
                case 60: goto L_0x0054;
                case 61: goto L_0x004c;
                case 62: goto L_0x004c;
                case 63: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0024
        L_0x004c:
            r7.back()
            java.lang.String r7 = r5.toString()
            return r7
        L_0x0054:
            java.lang.String r0 = "Bad character in a name"
            org.json.JSONException r7 = r7.syntaxError(r0)
            throw r7
        L_0x005b:
            java.lang.String r7 = r5.toString()
            return r7
        L_0x0060:
            java.lang.Character r7 = org.json.XML.QUEST
            return r7
        L_0x0063:
            java.lang.Character r7 = org.json.XML.GT
            return r7
        L_0x0066:
            java.lang.Character r7 = org.json.XML.EQ
            return r7
        L_0x0069:
            java.lang.String r0 = "Misplaced '<'"
            org.json.JSONException r7 = r7.syntaxError(r0)
            throw r7
        L_0x0070:
            java.lang.Character r7 = org.json.XML.BANG
            return r7
        L_0x0073:
            java.lang.Character r7 = org.json.XML.SLASH
            return r7
        L_0x0076:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x007b:
            char r2 = r7.next()
            if (r2 == 0) goto L_0x0098
            if (r2 != r0) goto L_0x0088
            java.lang.String r7 = r1.toString()
            return r7
        L_0x0088:
            r3 = 38
            if (r2 != r3) goto L_0x0094
            java.lang.Object r2 = r7.nextEntity(r2)
            r1.append(r2)
            goto L_0x007b
        L_0x0094:
            r1.append(r2)
            goto L_0x007b
        L_0x0098:
            java.lang.String r0 = "Unterminated string"
            org.json.JSONException r7 = r7.syntaxError(r0)
            throw r7
        L_0x009f:
            java.lang.String r0 = "Misshaped element"
            org.json.JSONException r7 = r7.syntaxError(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.XMLTokener.nextToken():java.lang.Object");
    }

    public void skipPast(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        while (i < length) {
            char next = next();
            if (next != 0) {
                cArr[i] = next;
                i++;
            } else {
                return;
            }
        }
        int i2 = 0;
        while (true) {
            int i3 = 0;
            int i4 = i2;
            while (i3 < length) {
                if (cArr[i4] != str.charAt(i3)) {
                    char next2 = next();
                    if (next2 != 0) {
                        cArr[i2] = next2;
                        i2++;
                        if (i2 >= length) {
                            i2 -= length;
                        }
                    } else {
                        return;
                    }
                } else {
                    i4++;
                    if (i4 >= length) {
                        i4 -= length;
                    }
                    i3++;
                }
            }
            return;
        }
    }

    public XMLTokener(String str) {
        super(str);
    }
}
