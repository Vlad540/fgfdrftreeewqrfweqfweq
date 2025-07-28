package defpackage;

/* renamed from: j80  reason: default package */
public final class j80 extends ld {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public j80(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ld)) {
            return false;
        }
        ld ldVar = (ld) obj;
        Integer num = this.a;
        if (num != null ? num.equals(((j80) ldVar).a) : ((j80) ldVar).a == null) {
            String str = this.b;
            if (str != null ? str.equals(((j80) ldVar).b) : ((j80) ldVar).b == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(((j80) ldVar).c) : ((j80) ldVar).c == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(((j80) ldVar).d) : ((j80) ldVar).d == null) {
                        String str4 = this.e;
                        if (str4 != null ? str4.equals(((j80) ldVar).e) : ((j80) ldVar).e == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(((j80) ldVar).f) : ((j80) ldVar).f == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(((j80) ldVar).g) : ((j80) ldVar).g == null) {
                                    String str7 = this.h;
                                    if (str7 != null ? str7.equals(((j80) ldVar).h) : ((j80) ldVar).h == null) {
                                        String str8 = this.i;
                                        if (str8 != null ? str8.equals(((j80) ldVar).i) : ((j80) ldVar).i == null) {
                                            String str9 = this.j;
                                            if (str9 != null ? str9.equals(((j80) ldVar).j) : ((j80) ldVar).j == null) {
                                                String str10 = this.k;
                                                if (str10 != null ? str10.equals(((j80) ldVar).k) : ((j80) ldVar).k == null) {
                                                    String str11 = this.l;
                                                    if (str11 == null) {
                                                        if (((j80) ldVar).l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((j80) ldVar).l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 0;
        Integer num = this.a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        return hashCode11 ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return wn6.l(sb, this.l, "}");
    }
}
