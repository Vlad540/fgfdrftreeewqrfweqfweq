package org.json;

import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import org.apache.http.HttpStatus;

public class XML {
    public static final Character AMP = '&';
    public static final Character APOS = '\'';
    public static final Character BANG = '!';
    public static final Character EQ = '=';
    public static final Character GT = '>';
    public static final Character LT = '<';
    public static final Character QUEST = '?';
    public static final Character QUOT = '\"';
    public static final Character SLASH = '/';

    private static Iterable<Integer> codePointIterator(final String str) {
        return new Iterable<Integer>() {
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    private int length;
                    private int nextIndex = 0;

                    {
                        this.length = str.length();
                    }

                    public boolean hasNext() {
                        return this.nextIndex < this.length;
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    public Integer next() {
                        int codePointAt = str.codePointAt(this.nextIndex);
                        this.nextIndex = Character.charCount(codePointAt) + this.nextIndex;
                        return Integer.valueOf(codePointAt);
                    }
                };
            }
        };
    }

    public static String escape(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (Integer intValue : codePointIterator(str)) {
            int intValue2 = intValue.intValue();
            if (intValue2 == 34) {
                sb.append("&quot;");
            } else if (intValue2 == 60) {
                sb.append("&lt;");
            } else if (intValue2 == 62) {
                sb.append("&gt;");
            } else if (intValue2 == 38) {
                sb.append("&amp;");
            } else if (intValue2 == 39) {
                sb.append("&apos;");
            } else if (mustEscape(intValue2)) {
                sb.append("&#x");
                sb.append(Integer.toHexString(intValue2));
                sb.append(';');
            } else {
                sb.appendCodePoint(intValue2);
            }
        }
        return sb.toString();
    }

    private static boolean mustEscape(int i) {
        return !(!Character.isISOControl(i) || i == 9 || i == 10 || i == 13) || ((i < 32 || i > 55295) && ((i < 57344 || i > 65533) && (i < 65536 || i > 1114111)));
    }

    public static void noSpace(String str) throws JSONException {
        int length = str.length();
        if (length != 0) {
            int i = 0;
            while (i < length) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    i++;
                } else {
                    throw new JSONException(wn6.i("'", str, "' contains a space character."));
                }
            }
            return;
        }
        throw new JSONException("Empty string.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x00fa, code lost:
        r7 = stringToValue(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x00fa, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        r7 = r10.nextToken();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ef, code lost:
        if ((r7 instanceof java.lang.String) == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f1, code lost:
        r7 = (java.lang.String) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f3, code lost:
        if (r13 == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0104, code lost:
        throw r10.syntaxError("Missing value");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean parse(org.json.XMLTokener r10, org.json.JSONObject r11, java.lang.String r12, boolean r13) throws org.json.JSONException {
        /*
            java.lang.Object r0 = r10.nextToken()
            java.lang.Character r1 = BANG
            r2 = 1
            java.lang.String r3 = "content"
            r4 = 0
            if (r0 != r1) goto L_0x006c
            char r12 = r10.next()
            r13 = 45
            if (r12 != r13) goto L_0x0024
            char r11 = r10.next()
            if (r11 != r13) goto L_0x0020
            java.lang.String r11 = "-->"
            r10.skipPast(r11)
            return r4
        L_0x0020:
            r10.back()
            goto L_0x004f
        L_0x0024:
            r13 = 91
            if (r12 != r13) goto L_0x004f
            java.lang.Object r12 = r10.nextToken()
            java.lang.String r0 = "CDATA"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x0048
            char r12 = r10.next()
            if (r12 != r13) goto L_0x0048
            java.lang.String r10 = r10.nextCDATA()
            int r12 = r10.length()
            if (r12 <= 0) goto L_0x0047
            r11.accumulate(r3, r10)
        L_0x0047:
            return r4
        L_0x0048:
            java.lang.String r11 = "Expected 'CDATA['"
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x004f:
            java.lang.Object r11 = r10.nextMeta()
            if (r11 == 0) goto L_0x0065
            java.lang.Character r12 = LT
            if (r11 != r12) goto L_0x005c
            int r2 = r2 + 1
            goto L_0x0062
        L_0x005c:
            java.lang.Character r12 = GT
            if (r11 != r12) goto L_0x0062
            int r2 = r2 + -1
        L_0x0062:
            if (r2 > 0) goto L_0x004f
            return r4
        L_0x0065:
            java.lang.String r11 = "Missing '>' after '<!'."
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x006c:
            java.lang.Character r1 = QUEST
            if (r0 != r1) goto L_0x0076
            java.lang.String r11 = "?>"
            r10.skipPast(r11)
            return r4
        L_0x0076:
            java.lang.Character r1 = SLASH
            if (r0 != r1) goto L_0x00c4
            java.lang.Object r11 = r10.nextToken()
            if (r12 == 0) goto L_0x00b1
            boolean r13 = r11.equals(r12)
            if (r13 == 0) goto L_0x0096
            java.lang.Object r11 = r10.nextToken()
            java.lang.Character r12 = GT
            if (r11 != r12) goto L_0x008f
            return r2
        L_0x008f:
            java.lang.String r11 = "Misshaped close tag"
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x0096:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Mismatched "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = " and "
            r13.append(r12)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x00b1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Mismatched close tag "
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x00c4:
            boolean r12 = r0 instanceof java.lang.Character
            java.lang.String r1 = "Misshaped tag"
            if (r12 != 0) goto L_0x0189
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            r5 = 0
        L_0x00d2:
            r6 = r5
        L_0x00d3:
            if (r6 != 0) goto L_0x00d9
            java.lang.Object r6 = r10.nextToken()
        L_0x00d9:
            boolean r7 = r6 instanceof java.lang.String
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x010a
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r10.nextToken()
            java.lang.Character r9 = EQ
            if (r7 != r9) goto L_0x0105
            java.lang.Object r7 = r10.nextToken()
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x00fe
            java.lang.String r7 = (java.lang.String) r7
            if (r13 == 0) goto L_0x00f6
            goto L_0x00fa
        L_0x00f6:
            java.lang.Object r7 = stringToValue(r7)
        L_0x00fa:
            r12.accumulate(r6, r7)
            goto L_0x00d2
        L_0x00fe:
            java.lang.String r11 = "Missing value"
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x0105:
            r12.accumulate(r6, r8)
            r6 = r7
            goto L_0x00d3
        L_0x010a:
            java.lang.Character r5 = SLASH
            if (r6 != r5) goto L_0x0129
            java.lang.Object r13 = r10.nextToken()
            java.lang.Character r2 = GT
            if (r13 != r2) goto L_0x0124
            int r10 = r12.length()
            if (r10 <= 0) goto L_0x0120
            r11.accumulate(r0, r12)
            goto L_0x0123
        L_0x0120:
            r11.accumulate(r0, r8)
        L_0x0123:
            return r4
        L_0x0124:
            org.json.JSONException r10 = r10.syntaxError(r1)
            throw r10
        L_0x0129:
            java.lang.Character r5 = GT
            if (r6 != r5) goto L_0x0184
        L_0x012d:
            java.lang.Object r1 = r10.nextContent()
            if (r1 != 0) goto L_0x0141
            if (r0 != 0) goto L_0x0136
            return r4
        L_0x0136:
            java.lang.String r11 = "Unclosed tag "
            java.lang.String r11 = r11.concat(r0)
            org.json.JSONException r10 = r10.syntaxError(r11)
            throw r10
        L_0x0141:
            boolean r5 = r1 instanceof java.lang.String
            if (r5 == 0) goto L_0x0158
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            if (r5 <= 0) goto L_0x012d
            if (r13 == 0) goto L_0x0150
            goto L_0x0154
        L_0x0150:
            java.lang.Object r1 = stringToValue(r1)
        L_0x0154:
            r12.accumulate(r3, r1)
            goto L_0x012d
        L_0x0158:
            java.lang.Character r5 = LT
            if (r1 != r5) goto L_0x012d
            boolean r1 = parse(r10, r12, r0, r13)
            if (r1 == 0) goto L_0x012d
            int r10 = r12.length()
            if (r10 != 0) goto L_0x016c
            r11.accumulate(r0, r8)
            goto L_0x0183
        L_0x016c:
            int r10 = r12.length()
            if (r10 != r2) goto L_0x0180
            java.lang.Object r10 = r12.opt(r3)
            if (r10 == 0) goto L_0x0180
            java.lang.Object r10 = r12.opt(r3)
            r11.accumulate(r0, r10)
            goto L_0x0183
        L_0x0180:
            r11.accumulate(r0, r12)
        L_0x0183:
            return r4
        L_0x0184:
            org.json.JSONException r10 = r10.syntaxError(r1)
            throw r10
        L_0x0189:
            org.json.JSONException r10 = r10.syntaxError(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.XML.parse(org.json.XMLTokener, org.json.JSONObject, java.lang.String, boolean):boolean");
    }

    public static Object stringToValue(String str) {
        if (str.equals("")) {
            return str;
        }
        if (str.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        if (str.equalsIgnoreCase("null")) {
            return JSONObject.NULL;
        }
        char charAt = str.charAt(0);
        if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
            try {
                if (str.indexOf(46) <= -1 && str.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) <= -1 && str.indexOf(69) <= -1) {
                    if (!"-0".equals(str)) {
                        Long valueOf = Long.valueOf(str);
                        if (str.equals(valueOf.toString())) {
                            return valueOf.longValue() == ((long) valueOf.intValue()) ? Integer.valueOf(valueOf.intValue()) : valueOf;
                        }
                    }
                }
                Double valueOf2 = Double.valueOf(str);
                return (valueOf2.isInfinite() || valueOf2.isNaN()) ? str : valueOf2;
            } catch (Exception unused) {
            }
        }
    }

    public static JSONObject toJSONObject(String str) throws JSONException {
        return toJSONObject(str, false);
    }

    public static String toString(Object obj) throws JSONException {
        return toString(obj, (String) null);
    }

    public static String unescape(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '&') {
                int indexOf = str.indexOf(59, i);
                if (indexOf > i) {
                    String substring = str.substring(i + 1, indexOf);
                    sb.append(XMLTokener.unescapeEntity(substring));
                    i += substring.length() + 1;
                } else {
                    sb.append(charAt);
                }
            } else {
                sb.append(charAt);
            }
            i++;
        }
        return sb.toString();
    }

    public static JSONObject toJSONObject(Reader reader) throws JSONException {
        return toJSONObject(reader, false);
    }

    public static String toString(Object obj, String str) throws JSONException {
        JSONArray jSONArray;
        StringBuilder sb = new StringBuilder();
        if (obj instanceof JSONObject) {
            if (str != null) {
                sb.append('<');
                sb.append(str);
                sb.append('>');
            }
            JSONObject jSONObject = (JSONObject) obj;
            for (String next : jSONObject.keySet()) {
                Object opt = jSONObject.opt(next);
                if (opt == null) {
                    opt = "";
                } else if (opt.getClass().isArray()) {
                    opt = new JSONArray(opt);
                }
                if ("content".equals(next)) {
                    if (opt instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) opt;
                        int length = jSONArray2.length();
                        for (int i = 0; i < length; i++) {
                            if (i > 0) {
                                sb.append(10);
                            }
                            sb.append(escape(jSONArray2.opt(i).toString()));
                        }
                    } else {
                        sb.append(escape(opt.toString()));
                    }
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray3 = (JSONArray) opt;
                    int length2 = jSONArray3.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        Object opt2 = jSONArray3.opt(i2);
                        if (opt2 instanceof JSONArray) {
                            sb.append('<');
                            sb.append(next);
                            sb.append('>');
                            sb.append(toString(opt2));
                            sb.append("</");
                            sb.append(next);
                            sb.append('>');
                        } else {
                            sb.append(toString(opt2, next));
                        }
                    }
                } else if ("".equals(opt)) {
                    sb.append('<');
                    sb.append(next);
                    sb.append("/>");
                } else {
                    sb.append(toString(opt, next));
                }
            }
            if (str != null) {
                sb.append("</");
                sb.append(str);
                sb.append('>');
            }
            return sb.toString();
        } else if (obj == null || (!(obj instanceof JSONArray) && !obj.getClass().isArray())) {
            String escape = obj == null ? "null" : escape(obj.toString());
            if (str == null) {
                return wn6.i("\"", escape, "\"");
            }
            if (escape.length() == 0) {
                return wn6.i("<", str, "/>");
            }
            return wn6.l(c3d.j("<", str, ">", escape, "</"), str, ">");
        } else {
            if (obj.getClass().isArray()) {
                jSONArray = new JSONArray(obj);
            } else {
                jSONArray = (JSONArray) obj;
            }
            int length3 = jSONArray.length();
            for (int i3 = 0; i3 < length3; i3++) {
                sb.append(toString(jSONArray.opt(i3), str == null ? "array" : str));
            }
            return sb.toString();
        }
    }

    public static JSONObject toJSONObject(Reader reader, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        XMLTokener xMLTokener = new XMLTokener(reader);
        while (xMLTokener.more()) {
            xMLTokener.skipPast("<");
            if (xMLTokener.more()) {
                parse(xMLTokener, jSONObject, (String) null, z);
            }
        }
        return jSONObject;
    }

    public static JSONObject toJSONObject(String str, boolean z) throws JSONException {
        return toJSONObject((Reader) new StringReader(str), z);
    }
}
