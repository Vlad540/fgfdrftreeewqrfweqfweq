package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: hs  reason: default package */
public final class hs {
    public static final zoa t;
    public static final Pattern u = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)*");
    public static final Pattern v = Pattern.compile("[- ]");
    public static final Pattern w = Pattern.compile(" ");
    public final StringBuilder a = new StringBuilder();
    public String b = BuildConfig.FLAVOR;
    public final StringBuilder c = new StringBuilder();
    public final StringBuilder d = new StringBuilder();
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public final loa i;
    public final String j;
    public final apa k;
    public apa l;
    public int m = 0;
    public final StringBuilder n = new StringBuilder();
    public boolean o = false;
    public String p = BuildConfig.FLAVOR;
    public final StringBuilder q = new StringBuilder();
    public final ArrayList r = new ArrayList();
    public final lhd s = new lhd(64);

    /* JADX WARNING: type inference failed for: r0v0, types: [apa, zoa] */
    static {
        ? apa = new apa();
        apa.X0 = "<ignored>";
        apa.Z0 = "NA";
        t = apa;
    }

    public hs(loa loa, String str) {
        this.i = loa;
        this.j = str;
        apa g2 = g(str);
        this.l = g2;
        this.k = g2;
    }

    public final String a(String str) {
        StringBuilder sb = this.n;
        int length = sb.length();
        if (!this.o || length <= 0 || sb.charAt(length - 1) == ' ') {
            return sb + str;
        }
        return new String(sb) + ' ' + str;
    }

    public final String b() {
        StringBuilder sb = this.q;
        if (sb.length() < 3) {
            return a(sb.toString());
        }
        String sb2 = sb.toString();
        for (yoa yoa : (!this.g || this.p.length() != 0 || this.l.m1.size() <= 0) ? this.l.l1 : this.l.m1) {
            if (this.p.length() > 0) {
                String str = yoa.X;
                if ((str.length() == 0 || loa.x.matcher(str).matches()) && !yoa.Y && !yoa.Z) {
                }
            }
            if (this.p.length() == 0 && !this.g) {
                String str2 = yoa.X;
                if (str2.length() != 0 && !loa.x.matcher(str2).matches() && !yoa.Y) {
                }
            }
            if (u.matcher(yoa.b).matches()) {
                this.r.add(yoa);
            }
        }
        l(sb2);
        String e2 = e();
        return e2.length() > 0 ? e2 : k() ? h() : this.c.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r1 = new java.lang.StringBuilder();
        r3 = r5.i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = r5.q
            int r1 = r0.length()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            loa r3 = r5.i
            int r4 = r3.c(r0, r1)
            if (r4 != 0) goto L_0x0018
            return r2
        L_0x0018:
            r0.setLength(r2)
            r0.append(r1)
            java.lang.String r0 = r3.k(r4)
            java.lang.String r1 = "001"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0031
            apa r0 = r3.f(r4)
            r5.l = r0
            goto L_0x003f
        L_0x0031:
            java.lang.String r1 = r5.j
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x003f
            apa r0 = r5.g(r0)
            r5.l = r0
        L_0x003f:
            java.lang.String r0 = java.lang.Integer.toString(r4)
            java.lang.StringBuilder r1 = r5.n
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = ""
            r5.p = r0
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs.c():boolean");
    }

    public final boolean d() {
        Pattern s2 = this.s.s("\\+|" + this.l.Z0);
        StringBuilder sb = this.d;
        Matcher matcher = s2.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.g = true;
        int end = matcher.end();
        StringBuilder sb2 = this.q;
        sb2.setLength(0);
        sb2.append(sb.substring(end));
        StringBuilder sb3 = this.n;
        sb3.setLength(0);
        sb3.append(sb.substring(0, end));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    public final String e() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            yoa yoa = (yoa) it.next();
            Matcher matcher = this.s.s(yoa.a).matcher(this.q);
            if (matcher.matches()) {
                this.o = v.matcher(yoa.X).find();
                String a2 = a(matcher.replaceAll(yoa.b));
                if (loa.s(a2, loa.i).contentEquals(this.d)) {
                    return a2;
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    public final void f() {
        this.c.setLength(0);
        this.d.setLength(0);
        this.a.setLength(0);
        this.m = 0;
        this.b = BuildConfig.FLAVOR;
        this.n.setLength(0);
        this.p = BuildConfig.FLAVOR;
        this.q.setLength(0);
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = false;
        this.r.clear();
        this.o = false;
        if (!this.l.equals(this.k)) {
            this.l = g(this.j);
        }
    }

    public final apa g(String str) {
        int i2;
        loa loa = this.i;
        if (!loa.n(str)) {
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            loa.h.log(level, wn6.l(sb, str, ") provided."));
            i2 = 0;
        } else {
            apa g2 = loa.g(str);
            if (g2 != null) {
                i2 = g2.Y0;
            } else {
                throw new IllegalArgumentException(rf0.h("Invalid region code: ", str));
            }
        }
        apa g3 = loa.g(loa.k(i2));
        return g3 != null ? g3 : t;
    }

    public final String h() {
        StringBuilder sb = this.q;
        int length = sb.length();
        if (length <= 0) {
            return this.n.toString();
        }
        String str = BuildConfig.FLAVOR;
        for (int i2 = 0; i2 < length; i2++) {
            str = j(sb.charAt(i2));
        }
        return this.e ? a(str) : this.c.toString();
    }

    public final String i(char c2) {
        StringBuilder sb = this.c;
        sb.append(c2);
        boolean isDigit = Character.isDigit(c2);
        StringBuilder sb2 = this.d;
        StringBuilder sb3 = this.q;
        if (!isDigit && (sb.length() != 1 || !loa.l.matcher(Character.toString(c2)).matches())) {
            this.e = false;
            this.f = true;
        } else if (c2 == '+') {
            sb2.append(c2);
        } else {
            c2 = Character.forDigit(Character.digit(c2, 10), 10);
            sb2.append(c2);
            sb3.append(c2);
        }
        boolean z = this.e;
        StringBuilder sb4 = this.n;
        if (z) {
            int length = sb2.length();
            if (length == 0 || length == 1 || length == 2) {
                return sb.toString();
            }
            if (length == 3) {
                if (d()) {
                    this.h = true;
                } else {
                    this.p = m();
                    return b();
                }
            }
            if (this.h) {
                if (c()) {
                    this.h = false;
                }
                return sb4 + sb3.toString();
            } else if (this.r.size() <= 0) {
                return b();
            } else {
                String j2 = j(c2);
                String e2 = e();
                if (e2.length() > 0) {
                    return e2;
                }
                l(sb3.toString());
                return k() ? h() : this.e ? a(j2) : sb.toString();
            }
        } else if (this.f) {
            return sb.toString();
        } else {
            if (!d()) {
                if (this.p.length() > 0) {
                    sb3.insert(0, this.p);
                    sb4.setLength(sb4.lastIndexOf(this.p));
                }
                if (!this.p.equals(m())) {
                    sb4.append(' ');
                    this.e = true;
                    this.h = false;
                    this.r.clear();
                    this.m = 0;
                    this.a.setLength(0);
                    this.b = BuildConfig.FLAVOR;
                    return b();
                }
            } else if (c()) {
                this.e = true;
                this.h = false;
                this.r.clear();
                this.m = 0;
                this.a.setLength(0);
                this.b = BuildConfig.FLAVOR;
                return b();
            }
            return sb.toString();
        }
    }

    public final String j(char c2) {
        StringBuilder sb = this.a;
        Matcher matcher = w.matcher(sb);
        if (matcher.find(this.m)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c2));
            sb.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.m = start;
            return sb.substring(0, start + 1);
        }
        if (this.r.size() == 1) {
            this.e = false;
        }
        this.b = BuildConfig.FLAVOR;
        return this.c.toString();
    }

    public final boolean k() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            yoa yoa = (yoa) it.next();
            String str = yoa.a;
            if (this.b.equals(str)) {
                return false;
            }
            String str2 = yoa.a;
            StringBuilder sb = this.a;
            sb.setLength(0);
            String str3 = yoa.b;
            Matcher matcher = this.s.s(str2).matcher("999999999999999");
            matcher.find();
            String group = matcher.group();
            String replaceAll = group.length() < this.q.length() ? BuildConfig.FLAVOR : group.replaceAll(str2, str3).replaceAll("9", " ");
            if (replaceAll.length() > 0) {
                sb.append(replaceAll);
                this.b = str;
                this.o = v.matcher(yoa.X).find();
                this.m = 0;
                return true;
            }
            it.remove();
        }
        this.e = false;
        return false;
    }

    public final void l(String str) {
        int length = str.length() - 3;
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            yoa yoa = (yoa) it.next();
            if (yoa.c.size() != 0) {
                if (!this.s.s((String) yoa.c.get(Math.min(length, yoa.c.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    public final String m() {
        int i2 = this.l.Y0;
        StringBuilder sb = this.n;
        int i3 = 1;
        StringBuilder sb2 = this.q;
        if (i2 != 1 || sb2.charAt(0) != '1' || sb2.charAt(1) == '0' || sb2.charAt(1) == '1') {
            apa apa = this.l;
            if (apa.g1) {
                Matcher matcher = this.s.s(apa.h1).matcher(sb2);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.g = true;
                    i3 = matcher.end();
                    sb.append(sb2.substring(0, i3));
                }
            }
            i3 = 0;
        } else {
            sb.append('1');
            sb.append(' ');
            this.g = true;
        }
        String substring = sb2.substring(0, i3);
        sb2.delete(0, i3);
        return substring;
    }
}
