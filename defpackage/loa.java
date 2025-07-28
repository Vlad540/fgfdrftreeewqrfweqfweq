package defpackage;

import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: loa  reason: default package */
public final class loa {
    public static final Logger h = Logger.getLogger(loa.class.getName());
    public static final Map i;
    public static final Map j;
    public static final Map k;
    public static final Pattern l = Pattern.compile("[+＋]+");
    public static final Pattern m = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
    public static final Pattern n = Pattern.compile("(\\p{Nd})");
    public static final Pattern o = Pattern.compile("[+＋\\p{Nd}]");
    public static final Pattern p = Pattern.compile("[\\\\/] *x");
    public static final Pattern q = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    public static final Pattern r = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    public static final Pattern s = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
    public static final Pattern t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w = Pattern.compile("(\\$\\d)");
    public static final Pattern x = Pattern.compile("\\(?\\$1\\)?");
    public final otf a;
    public final Map b;
    public final wwc c = new wwc(21);
    public final HashSet d = new HashSet(35);
    public final lhd e = new lhd(100);
    public final HashSet f = new HashSet(320);
    public final HashSet g = new HashSet();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        j = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        k = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        i = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            hashMap6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            hashMap6.put(ch, ch);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put(65293, '-');
        hashMap6.put(8208, '-');
        hashMap6.put(8209, '-');
        hashMap6.put(8210, '-');
        hashMap6.put(8211, '-');
        hashMap6.put(8212, '-');
        hashMap6.put(8213, '-');
        hashMap6.put(8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put(65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put(12288, ' ');
        hashMap6.put(8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put(65294, '.');
        Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map = j;
        sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", BuildConfig.FLAVOR));
        sb.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", BuildConfig.FLAVOR));
        String sb2 = sb.toString();
        String i2 = wn6.i("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*", sb2, "\\p{Nd}]*");
        String a2 = a(true);
        a(false);
        String g2 = hr1.g(sb2, "\\p{Nd}");
        String i3 = c3d.i("[", g2, "]+((\\-)*[", g2, "])*");
        String i4 = c3d.i("[", sb2, "]+((\\-)*[", g2, "])*");
        t = Pattern.compile("^(" + i3 + "\\.)*" + i4 + "\\.?$");
        StringBuilder sb3 = new StringBuilder("(?:");
        sb3.append(a2);
        sb3.append(")$");
        u = Pattern.compile(sb3.toString(), 66);
        v = Pattern.compile(i2 + "(?:" + a2 + ")?", 66);
        Pattern.compile("(\\D+)");
    }

    public loa(otf otf, HashMap hashMap) {
        this.a = otf;
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() != 1 || !"001".equals(list.get(0))) {
                this.f.addAll(list);
            } else {
                this.g.add((Integer) entry.getKey());
            }
        }
        if (this.f.remove("001")) {
            h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll((Collection) hashMap.get(1));
    }

    public static String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(";ext=" + b(20));
        sb.append("|");
        sb.append("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + b(20) + "#?");
        sb.append("|");
        sb.append("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + b(9) + "#?");
        String l2 = wn6.l(sb, "|", "[- ]+" + b(6) + "#");
        if (!z) {
            return l2;
        }
        return l2 + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + b(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + b(9) + "#?");
    }

    public static String b(int i2) {
        return rf0.f(i2, "(\\p{Nd}{1,", "})");
    }

    public static String h(cpa cpa) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (cpa.Y && (i2 = cpa.w0) > 0) {
            char[] cArr = new char[i2];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(cpa.b);
        return sb.toString();
    }

    public static bpa i(apa apa, int i2) {
        switch (hr1.t(i2)) {
            case 0:
            case 2:
                return apa.o;
            case 1:
                return apa.Y;
            case 3:
                return apa.w0;
            case 4:
                return apa.y0;
            case 5:
                return apa.A0;
            case 6:
                return apa.E0;
            case 7:
                return apa.C0;
            case 8:
                return apa.G0;
            case 9:
                return apa.I0;
            case 10:
                return apa.M0;
            default:
                return apa.b;
        }
    }

    public static void q(StringBuilder sb) {
        if (r.matcher(sb).matches()) {
            sb.replace(0, sb.length(), s(sb, k));
        } else {
            sb.replace(0, sb.length(), r(sb));
        }
    }

    public static String r(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int digit = Character.digit(charSequence.charAt(i2), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    public static String s(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i2))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void u(int i2, int i3, StringBuilder sb) {
        int t2 = hr1.t(i3);
        if (t2 == 0) {
            sb.insert(0, i2).insert(0, '+');
        } else if (t2 == 1) {
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
        } else if (t2 == 3) {
            sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
        }
    }

    public static int v(StringBuilder sb, apa apa, int i2) {
        bpa i3 = i(apa, i2);
        ArrayList arrayList = i3.c.isEmpty() ? apa.b.c : i3.c;
        ArrayList arrayList2 = i3.o;
        if (i2 == 3) {
            bpa i4 = i(apa, 1);
            if (!((i4.c.size() == 1 && ((Integer) i4.c.get(0)).intValue() == -1) ? false : true)) {
                return v(sb, apa, 2);
            }
            bpa i5 = i(apa, 2);
            if (!(i5.c.size() == 1 && ((Integer) i5.c.get(0)).intValue() == -1)) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList3.addAll(i5.c.size() == 0 ? apa.b.c : i5.c);
                Collections.sort(arrayList3);
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList4 = i5.o;
                if (isEmpty) {
                    arrayList2 = arrayList4;
                } else {
                    ArrayList arrayList5 = new ArrayList(arrayList2);
                    arrayList5.addAll(arrayList4);
                    Collections.sort(arrayList5);
                    arrayList2 = arrayList5;
                }
                arrayList = arrayList3;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = sb.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return 2;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        if (intValue == length) {
            return 1;
        }
        if (intValue > length) {
            return 4;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return 6;
        }
        return arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length)) ? 1 : 5;
    }

    public final int c(StringBuilder sb, StringBuilder sb2) {
        if (!(sb.length() == 0 || sb.charAt(0) == '0')) {
            int length = sb.length();
            int i2 = 1;
            while (i2 <= 3 && i2 <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i2));
                if (this.b.containsKey(Integer.valueOf(parseInt))) {
                    sb2.append(sb.substring(i2));
                    return parseInt;
                }
                i2++;
            }
        }
        return 0;
    }

    public final String d(cpa cpa, int i2) {
        lhd lhd;
        yoa yoa;
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i3 = cpa.a;
        String h2 = h(cpa);
        if (i2 == 1) {
            sb.append(h2);
            u(i3, 1, sb);
        } else {
            if (!this.b.containsKey(Integer.valueOf(i3))) {
                sb.append(h2);
            } else {
                String k2 = k(i3);
                apa f2 = "001".equals(k2) ? f(i3) : g(k2);
                Iterator it = ((f2.m1.size() == 0 || i2 == 3) ? f2.l1 : f2.m1).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    lhd = this.e;
                    if (!hasNext) {
                        yoa = null;
                        break;
                    }
                    yoa = (yoa) it.next();
                    int size = yoa.c.size();
                    if (size != 0) {
                        if (!lhd.s((String) yoa.c.get(size - 1)).matcher(h2).lookingAt()) {
                            continue;
                        }
                    }
                    if (lhd.s(yoa.a).matcher(h2).matches()) {
                        break;
                    }
                }
                if (yoa != null) {
                    String str = yoa.b;
                    Matcher matcher = lhd.s(yoa.a).matcher(h2);
                    String str2 = yoa.X;
                    h2 = (i2 != 3 || str2 == null || str2.length() <= 0) ? matcher.replaceAll(str) : matcher.replaceAll(w.matcher(str).replaceFirst(str2));
                    if (i2 == 4) {
                        Matcher matcher2 = m.matcher(h2);
                        if (matcher2.lookingAt()) {
                            h2 = matcher2.replaceFirst(BuildConfig.FLAVOR);
                        }
                        h2 = matcher2.reset(h2).replaceAll("-");
                    }
                }
                sb.append(h2);
                if (cpa.c && cpa.o.length() > 0) {
                    if (i2 == 4) {
                        sb.append(";ext=");
                        sb.append(cpa.o);
                    } else if (f2.e1) {
                        sb.append(f2.f1);
                        sb.append(cpa.o);
                    } else {
                        sb.append(" ext. ");
                        sb.append(cpa.o);
                    }
                }
                u(i3, i2, sb);
            }
        }
        return sb.toString();
    }

    public final cpa e(String str) {
        boolean n2 = n(str);
        Logger logger = h;
        if (!n2) {
            Level level = Level.WARNING;
            logger.log(level, "Invalid or unknown region code provided: " + str);
            return null;
        }
        bpa i2 = i(g(str), 2);
        try {
            if (i2.X) {
                return t(str, i2.Y);
            }
        } catch (NumberParseException e2) {
            logger.log(Level.SEVERE, e2.toString());
        }
        return null;
    }

    public final apa f(int i2) {
        if (!this.g.contains(Integer.valueOf(i2))) {
            return null;
        }
        otf otf = this.a;
        otf.getClass();
        List list = (List) d8.s().get(Integer.valueOf(i2));
        if (list == null || list.contains("001")) {
            String a2 = ((m99) ((koa) otf.a)).a(Integer.valueOf(i2));
            apa apa = (apa) ((ConcurrentHashMap) ((w83) ((nxc) otf.b).z(a2)).a.a).get(Integer.valueOf(i2));
            String h2 = wn6.h(i2, "Missing metadata for country code ");
            if (apa != null) {
                return apa;
            }
            throw new IllegalStateException(h2);
        }
        throw new IllegalArgumentException(i2 + " calling code belongs to a geo entity");
    }

    public final apa g(String str) {
        if (!n(str)) {
            return null;
        }
        otf otf = this.a;
        otf.getClass();
        if (!str.equals("001")) {
            apa apa = (apa) ((ConcurrentHashMap) ((w83) ((nxc) otf.b).z(((m99) ((koa) otf.a)).a(str))).b.a).get(str);
            String concat = "Missing metadata for region code ".concat(str);
            if (apa != null) {
                return apa;
            }
            throw new IllegalStateException(concat);
        }
        throw new IllegalArgumentException(str.concat(" region code is a non-geo entity"));
    }

    public final int j(String str, apa apa) {
        if (!l(str, apa.b)) {
            return 12;
        }
        if (l(str, apa.y0)) {
            return 5;
        }
        if (l(str, apa.w0)) {
            return 4;
        }
        if (l(str, apa.A0)) {
            return 6;
        }
        if (l(str, apa.E0)) {
            return 7;
        }
        if (l(str, apa.C0)) {
            return 8;
        }
        if (l(str, apa.G0)) {
            return 9;
        }
        if (l(str, apa.I0)) {
            return 10;
        }
        if (l(str, apa.M0)) {
            return 11;
        }
        return l(str, apa.o) ? (!apa.k1 && !l(str, apa.Y)) ? 1 : 3 : (apa.k1 || !l(str, apa.Y)) ? 12 : 2;
    }

    public final String k(int i2) {
        List list = (List) this.b.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final boolean l(String str, bpa bpa) {
        int length = str.length();
        ArrayList arrayList = bpa.c;
        if (arrayList.size() <= 0 || arrayList.contains(Integer.valueOf(length))) {
            return this.c.W(str, bpa);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(defpackage.cpa r10) {
        /*
            r9 = this;
            int r0 = r10.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.Map r2 = r9.b
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            r2 = 12
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0025
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            java.lang.String r6 = "Missing/invalid country_code ("
            java.lang.String r7 = ")"
            java.lang.String r0 = rf0.f(r0, r6, r7)
            java.util.logging.Logger r6 = h
            r6.log(r1, r0)
            goto L_0x006a
        L_0x0025:
            int r0 = r1.size()
            if (r0 != r4) goto L_0x0033
            java.lang.Object r0 = r1.get(r3)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x006a
        L_0x0033:
            java.lang.String r0 = h(r10)
            java.util.Iterator r1 = r1.iterator()
        L_0x003b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x006a
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            apa r7 = r9.g(r6)
            boolean r8 = r7.o1
            if (r8 == 0) goto L_0x0063
            java.lang.String r7 = r7.p1
            lhd r8 = r9.e
            java.util.regex.Pattern r7 = r8.s(r7)
            java.util.regex.Matcher r7 = r7.matcher(r0)
            boolean r7 = r7.lookingAt()
            if (r7 == 0) goto L_0x003b
        L_0x0061:
            r5 = r6
            goto L_0x006a
        L_0x0063:
            int r7 = r9.j(r0, r7)
            if (r7 == r2) goto L_0x003b
            goto L_0x0061
        L_0x006a:
            int r0 = r10.a
            java.lang.String r1 = "001"
            boolean r6 = r1.equals(r5)
            if (r6 == 0) goto L_0x0079
            apa r6 = r9.f(r0)
            goto L_0x007d
        L_0x0079:
            apa r6 = r9.g(r5)
        L_0x007d:
            if (r6 == 0) goto L_0x00a7
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x009c
            apa r1 = r9.g(r5)
            if (r1 == 0) goto L_0x0090
            int r1 = r1.Y0
            if (r0 == r1) goto L_0x009c
            goto L_0x00a7
        L_0x0090:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Invalid region code: "
            java.lang.String r10 = rf0.h(r10, r5)
            r9.<init>(r10)
            throw r9
        L_0x009c:
            java.lang.String r10 = h(r10)
            int r9 = r9.j(r10, r6)
            if (r9 == r2) goto L_0x00a7
            r3 = r4
        L_0x00a7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.loa.m(cpa):boolean");
    }

    public final boolean n(String str) {
        return str != null && this.f.contains(str);
    }

    public final int o(CharSequence charSequence, apa apa, StringBuilder sb, cpa cpa) {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = apa != null ? apa.Z0 : "NonMatch";
        if (sb2.length() != 0) {
            Matcher matcher = l.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                q(sb2);
            } else {
                Pattern s2 = this.e.s(str);
                q(sb2);
                Matcher matcher2 = s2.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = n.matcher(sb2.substring(end));
                    if (!matcher3.find() || !r(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, end);
                    }
                }
            }
            if (sb2.length() > 2) {
                int c2 = c(sb2, sb);
                if (c2 != 0) {
                    cpa.a = c2;
                    return c2;
                }
                throw new NumberParseException(1, "Country calling code supplied was not recognised.");
            }
            throw new NumberParseException(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        if (apa != null) {
            int i2 = apa.Y0;
            String valueOf = String.valueOf(i2);
            String sb3 = sb2.toString();
            if (sb3.startsWith(valueOf)) {
                StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                bpa bpa = apa.b;
                p(sb4, apa, (StringBuilder) null);
                wwc wwc = this.c;
                if ((!wwc.W(sb2, bpa) && wwc.W(sb4, bpa)) || v(sb2, apa, 12) == 6) {
                    sb.append(sb4);
                    cpa.a = i2;
                    return i2;
                }
            }
        }
        cpa.a = 0;
        return 0;
    }

    public final void p(StringBuilder sb, apa apa, StringBuilder sb2) {
        int length = sb.length();
        String str = apa.h1;
        if (length != 0 && str.length() != 0) {
            Matcher matcher = this.e.s(str).matcher(sb);
            if (matcher.lookingAt()) {
                bpa bpa = apa.b;
                wwc wwc = this.c;
                boolean W = wwc.W(sb, bpa);
                int groupCount = matcher.groupCount();
                String str2 = apa.j1;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!W || wwc.W(sb3.toString(), bpa)) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                    }
                } else if (!W || wwc.W(sb.substring(matcher.end()), bpa)) {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [cpa, java.lang.Object] */
    public final cpa t(String str, CharSequence charSequence) {
        String str2;
        int i2;
        CharSequence charSequence2;
        ? obj = new Object();
        obj.a = 0;
        obj.b = 0;
        String str3 = BuildConfig.FLAVOR;
        obj.o = str3;
        obj.Y = false;
        obj.w0 = 1;
        obj.x0 = str3;
        obj.z0 = str3;
        obj.y0 = 5;
        if (charSequence == null) {
            throw new NumberParseException(2, "The phone number supplied was null.");
        } else if (charSequence.length() <= 250) {
            StringBuilder sb = new StringBuilder();
            String charSequence3 = charSequence.toString();
            int indexOf = charSequence3.indexOf(";phone-context=");
            if (indexOf == -1) {
                str2 = null;
            } else {
                int i3 = indexOf + 15;
                if (i3 >= charSequence3.length()) {
                    str2 = str3;
                } else {
                    int indexOf2 = charSequence3.indexOf(59, i3);
                    str2 = indexOf2 != -1 ? charSequence3.substring(i3, indexOf2) : charSequence3.substring(i3);
                }
            }
            if (str2 != null && (str2.length() == 0 || (!s.matcher(str2).matches() && !t.matcher(str2).matches()))) {
                throw new NumberParseException(2, "The phone-context value is invalid.");
            }
            if (str2 != null) {
                if (str2.charAt(0) == '+') {
                    sb.append(str2);
                }
                int indexOf3 = charSequence3.indexOf("tel:");
                sb.append(charSequence3.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
            } else {
                Matcher matcher = o.matcher(charSequence3);
                if (matcher.find()) {
                    charSequence2 = charSequence3.subSequence(matcher.start(), charSequence3.length());
                    Matcher matcher2 = q.matcher(charSequence2);
                    if (matcher2.find()) {
                        charSequence2 = charSequence2.subSequence(0, matcher2.start());
                    }
                    Matcher matcher3 = p.matcher(charSequence2);
                    if (matcher3.find()) {
                        charSequence2 = charSequence2.subSequence(0, matcher3.start());
                    }
                } else {
                    charSequence2 = str3;
                }
                sb.append(charSequence2);
            }
            int indexOf4 = sb.indexOf(";isub=");
            if (indexOf4 > 0) {
                sb.delete(indexOf4, sb.length());
            }
            int length = sb.length();
            Pattern pattern = v;
            if (length < 2 ? false : pattern.matcher(sb).matches()) {
                boolean n2 = n(str);
                Pattern pattern2 = l;
                if (n2 || (sb.length() != 0 && pattern2.matcher(sb).lookingAt())) {
                    Matcher matcher4 = u.matcher(sb);
                    if (matcher4.find()) {
                        String substring = sb.substring(0, matcher4.start());
                        if (substring.length() < 2 ? false : pattern.matcher(substring).matches()) {
                            int groupCount = matcher4.groupCount();
                            int i4 = 1;
                            while (true) {
                                if (i4 > groupCount) {
                                    break;
                                } else if (matcher4.group(i4) != null) {
                                    str3 = matcher4.group(i4);
                                    sb.delete(matcher4.start(), sb.length());
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                    if (str3.length() > 0) {
                        obj.c = true;
                        obj.o = str3;
                    }
                    apa g2 = g(str);
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        i2 = o(sb, g2, sb2, obj);
                    } catch (NumberParseException e2) {
                        Matcher matcher5 = pattern2.matcher(sb);
                        int i5 = e2.a;
                        if (i5 != 1 || !matcher5.lookingAt()) {
                            throw new NumberParseException(i5, e2.getMessage());
                        }
                        i2 = o(sb.substring(matcher5.end()), g2, sb2, obj);
                        if (i2 == 0) {
                            throw new NumberParseException(1, "Could not interpret numbers after plus-sign.");
                        }
                    }
                    if (i2 != 0) {
                        String k2 = k(i2);
                        if (!k2.equals(str)) {
                            g2 = "001".equals(k2) ? f(i2) : g(k2);
                        }
                    } else {
                        q(sb);
                        sb2.append(sb);
                        if (str != null) {
                            obj.a = g2.Y0;
                        }
                    }
                    if (sb2.length() >= 2) {
                        if (g2 != null) {
                            StringBuilder sb3 = new StringBuilder();
                            StringBuilder sb4 = new StringBuilder(sb2);
                            p(sb4, g2, sb3);
                            int v2 = v(sb4, g2, 12);
                            if (!(v2 == 4 || v2 == 2 || v2 == 5)) {
                                sb2 = sb4;
                            }
                        }
                        int length2 = sb2.length();
                        if (length2 < 2) {
                            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
                        } else if (length2 <= 17) {
                            if (sb2.length() > 1 && sb2.charAt(0) == '0') {
                                obj.X = true;
                                obj.Y = true;
                                int i6 = 1;
                                while (i6 < sb2.length() - 1 && sb2.charAt(i6) == '0') {
                                    i6++;
                                }
                                if (i6 != 1) {
                                    obj.Z = true;
                                    obj.w0 = i6;
                                }
                            }
                            obj.b = Long.parseLong(sb2.toString());
                            return obj;
                        } else {
                            throw new NumberParseException(5, "The string supplied is too long to be a phone number.");
                        }
                    } else {
                        throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
                    }
                } else {
                    throw new NumberParseException(1, "Missing or invalid default region.");
                }
            } else {
                throw new NumberParseException(2, "The string supplied did not seem to be a phone number.");
            }
        } else {
            throw new NumberParseException(5, "The string supplied was too long to parse.");
        }
    }
}
