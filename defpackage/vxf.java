package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.HTTP;

/* renamed from: vxf  reason: default package */
public final class vxf {
    public static final Pattern e = Pattern.compile("^a=(?:rtcp-fb|fmtp):(\\d+) (apt=(\\d+))?.*$");
    public static final Pattern f = Pattern.compile("^a=rtpmap:(\\d+) ([a-zA-Z0-9-]+)(/\\d+)+[\r]?$");
    public final HashSet a;
    public final String b;
    public final int c;
    public final LinkedHashMap d;

    public vxf(String str, int i, LinkedHashMap linkedHashMap) {
        this.b = str;
        this.c = i;
        this.d = linkedHashMap;
        this.a = new HashSet(linkedHashMap.size() * 7);
    }

    public static vxf a(int i, String str) {
        List asList = Arrays.asList(str.split(" "));
        if (asList.size() <= 3) {
            return null;
        }
        asList.subList(0, 3);
        ArrayList arrayList = new ArrayList(asList.subList(3, asList.size()));
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size(), 2.0f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            linkedHashMap.put(str2, new pxf(str2));
        }
        return new vxf(str, i, linkedHashMap);
    }

    public final ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        for (pxf pxf : this.d.values()) {
            if (Objects.equals(str, pxf.b)) {
                arrayList.add(pxf);
            }
        }
        return arrayList;
    }

    public final void c(StringBuilder sb, List list, boolean z) {
        boolean d2 = d(list);
        LinkedHashMap linkedHashMap = this.d;
        if (!d2 && !z) {
            for (pxf pxf : linkedHashMap.values()) {
                Iterator it = pxf.c.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append(HTTP.CRLF);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator it3 = b((String) it2.next()).iterator();
            while (it3.hasNext()) {
                pxf pxf2 = (pxf) it3.next();
                Iterator it4 = pxf2.c.iterator();
                while (it4.hasNext()) {
                    sb.append((String) it4.next());
                    sb.append(HTTP.CRLF);
                }
                Iterator it5 = pxf2.d.iterator();
                while (it5.hasNext()) {
                    String str = (String) it5.next();
                    pxf pxf3 = (pxf) linkedHashMap.get(str);
                    if (pxf3 != null) {
                        Iterator it6 = pxf3.c.iterator();
                        while (it6.hasNext()) {
                            sb.append((String) it6.next());
                            sb.append(HTTP.CRLF);
                        }
                        arrayList.add(str);
                    }
                }
            }
        }
        if (!z) {
            for (pxf pxf4 : linkedHashMap.values()) {
                if (!list.contains(pxf4.b) && !arrayList.contains(pxf4.a)) {
                    Iterator it7 = pxf4.c.iterator();
                    while (it7.hasNext()) {
                        sb.append((String) it7.next());
                        sb.append(HTTP.CRLF);
                    }
                }
            }
        }
    }

    public final boolean d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i, String str) {
        pxf pxf;
        pxf pxf2;
        pxf pxf3;
        if (str.startsWith("a=")) {
            Matcher matcher = e.matcher(str);
            boolean matches = matcher.matches();
            HashSet hashSet = this.a;
            LinkedHashMap linkedHashMap = this.d;
            if (matches) {
                String group = matcher.group(1);
                String group2 = matcher.group(3);
                if (!(group2 == null || (pxf3 = (pxf) linkedHashMap.get(group2)) == null)) {
                    pxf3.d.add(group);
                }
                if (group != null && (pxf2 = (pxf) linkedHashMap.get(group)) != null) {
                    pxf2.c.add(str);
                    hashSet.add(Integer.valueOf(i));
                    return;
                }
                return;
            }
            Matcher matcher2 = f.matcher(str);
            if (matcher2.matches()) {
                String group3 = matcher2.group(1);
                String group4 = matcher2.group(2);
                if (group4 != null && group3 != null && (pxf = (pxf) linkedHashMap.get(group3)) != null) {
                    pxf.b = group4;
                    pxf pxf4 = (pxf) linkedHashMap.get(group3);
                    if (pxf4 != null) {
                        pxf4.c.add(str);
                        hashSet.add(Integer.valueOf(i));
                    }
                }
            }
        }
    }

    public final void f(StringBuilder sb, List list, boolean z) {
        boolean d2 = d(list);
        String str = this.b;
        if (d2 || z) {
            List<String> subList = Arrays.asList(str.split(" ")).subList(0, 3);
            ArrayList arrayList = new ArrayList();
            for (String append : subList) {
                sb.append(append);
                sb.append(' ');
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Iterator it2 = b((String) it.next()).iterator();
                while (it2.hasNext()) {
                    pxf pxf = (pxf) it2.next();
                    sb.append(pxf.a);
                    sb.append(' ');
                    Iterator it3 = pxf.d.iterator();
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        sb.append(str2);
                        sb.append(' ');
                        arrayList.add(str2);
                    }
                }
            }
            if (!z) {
                for (pxf pxf2 : this.d.values()) {
                    if (!list.contains(pxf2.b)) {
                        String str3 = pxf2.a;
                        if (!arrayList.contains(str3)) {
                            sb.append(str3);
                            sb.append(' ');
                        }
                    }
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append(HTTP.CRLF);
            return;
        }
        sb.append(str);
        sb.append(HTTP.CRLF);
    }
}
