package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public class BasicHeaderValueFormatter implements HeaderValueFormatter {
    public static final BasicHeaderValueFormatter DEFAULT = new BasicHeaderValueFormatter();
    public static final String SEPARATORS = " ;,:@()<>\\\"/[]?={}\t";
    public static final String UNSAFE_CHARS = "\"\\";

    public static final String formatElements(HeaderElement[] headerElementArr, boolean z, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = DEFAULT;
        }
        return headerValueFormatter.formatElements((CharArrayBuffer) null, headerElementArr, z).toString();
    }

    public static final String formatHeaderElement(HeaderElement headerElement, boolean z, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = DEFAULT;
        }
        return headerValueFormatter.formatHeaderElement((CharArrayBuffer) null, headerElement, z).toString();
    }

    public static final String formatNameValuePair(NameValuePair nameValuePair, boolean z, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = DEFAULT;
        }
        return headerValueFormatter.formatNameValuePair((CharArrayBuffer) null, nameValuePair, z).toString();
    }

    public static final String formatParameters(NameValuePair[] nameValuePairArr, boolean z, HeaderValueFormatter headerValueFormatter) {
        if (headerValueFormatter == null) {
            headerValueFormatter = DEFAULT;
        }
        return headerValueFormatter.formatParameters((CharArrayBuffer) null, nameValuePairArr, z).toString();
    }

    public void doFormatValue(CharArrayBuffer charArrayBuffer, String str, boolean z) {
        if (!z) {
            for (int i = 0; i < str.length() && !z; i++) {
                z = isSeparator(str.charAt(i));
            }
        }
        if (z) {
            charArrayBuffer.append('\"');
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (isUnsafe(charAt)) {
                charArrayBuffer.append('\\');
            }
            charArrayBuffer.append(charAt);
        }
        if (z) {
            charArrayBuffer.append('\"');
        }
    }

    public int estimateElementsLen(HeaderElement[] headerElementArr) {
        if (headerElementArr == null || headerElementArr.length < 1) {
            return 0;
        }
        int length = (headerElementArr.length - 1) * 2;
        for (HeaderElement estimateHeaderElementLen : headerElementArr) {
            length += estimateHeaderElementLen(estimateHeaderElementLen);
        }
        return length;
    }

    public int estimateHeaderElementLen(HeaderElement headerElement) {
        if (headerElement == null) {
            return 0;
        }
        int length = headerElement.getName().length();
        String value = headerElement.getValue();
        if (value != null) {
            length += value.length() + 3;
        }
        int parameterCount = headerElement.getParameterCount();
        if (parameterCount > 0) {
            for (int i = 0; i < parameterCount; i++) {
                length += estimateNameValuePairLen(headerElement.getParameter(i)) + 2;
            }
        }
        return length;
    }

    public int estimateNameValuePairLen(NameValuePair nameValuePair) {
        if (nameValuePair == null) {
            return 0;
        }
        int length = nameValuePair.getName().length();
        String value = nameValuePair.getValue();
        return value != null ? length + value.length() + 3 : length;
    }

    public int estimateParametersLen(NameValuePair[] nameValuePairArr) {
        if (nameValuePairArr == null || nameValuePairArr.length < 1) {
            return 0;
        }
        int length = (nameValuePairArr.length - 1) * 2;
        for (NameValuePair estimateNameValuePairLen : nameValuePairArr) {
            length += estimateNameValuePairLen(estimateNameValuePairLen);
        }
        return length;
    }

    public boolean isSeparator(char c) {
        return SEPARATORS.indexOf(c) >= 0;
    }

    public boolean isUnsafe(char c) {
        return UNSAFE_CHARS.indexOf(c) >= 0;
    }

    public CharArrayBuffer formatElements(CharArrayBuffer charArrayBuffer, HeaderElement[] headerElementArr, boolean z) {
        if (headerElementArr != null) {
            int estimateElementsLen = estimateElementsLen(headerElementArr);
            if (charArrayBuffer == null) {
                charArrayBuffer = new CharArrayBuffer(estimateElementsLen);
            } else {
                charArrayBuffer.ensureCapacity(estimateElementsLen);
            }
            for (int i = 0; i < headerElementArr.length; i++) {
                if (i > 0) {
                    charArrayBuffer.append(", ");
                }
                formatHeaderElement(charArrayBuffer, headerElementArr[i], z);
            }
            return charArrayBuffer;
        }
        throw new IllegalArgumentException("Header element array must not be null.");
    }

    public CharArrayBuffer formatHeaderElement(CharArrayBuffer charArrayBuffer, HeaderElement headerElement, boolean z) {
        if (headerElement != null) {
            int estimateHeaderElementLen = estimateHeaderElementLen(headerElement);
            if (charArrayBuffer == null) {
                charArrayBuffer = new CharArrayBuffer(estimateHeaderElementLen);
            } else {
                charArrayBuffer.ensureCapacity(estimateHeaderElementLen);
            }
            charArrayBuffer.append(headerElement.getName());
            String value = headerElement.getValue();
            if (value != null) {
                charArrayBuffer.append('=');
                doFormatValue(charArrayBuffer, value, z);
            }
            int parameterCount = headerElement.getParameterCount();
            if (parameterCount > 0) {
                for (int i = 0; i < parameterCount; i++) {
                    charArrayBuffer.append("; ");
                    formatNameValuePair(charArrayBuffer, headerElement.getParameter(i), z);
                }
            }
            return charArrayBuffer;
        }
        throw new IllegalArgumentException("Header element must not be null.");
    }

    public CharArrayBuffer formatNameValuePair(CharArrayBuffer charArrayBuffer, NameValuePair nameValuePair, boolean z) {
        if (nameValuePair != null) {
            int estimateNameValuePairLen = estimateNameValuePairLen(nameValuePair);
            if (charArrayBuffer == null) {
                charArrayBuffer = new CharArrayBuffer(estimateNameValuePairLen);
            } else {
                charArrayBuffer.ensureCapacity(estimateNameValuePairLen);
            }
            charArrayBuffer.append(nameValuePair.getName());
            String value = nameValuePair.getValue();
            if (value != null) {
                charArrayBuffer.append('=');
                doFormatValue(charArrayBuffer, value, z);
            }
            return charArrayBuffer;
        }
        throw new IllegalArgumentException("NameValuePair must not be null.");
    }

    public CharArrayBuffer formatParameters(CharArrayBuffer charArrayBuffer, NameValuePair[] nameValuePairArr, boolean z) {
        if (nameValuePairArr != null) {
            int estimateParametersLen = estimateParametersLen(nameValuePairArr);
            if (charArrayBuffer == null) {
                charArrayBuffer = new CharArrayBuffer(estimateParametersLen);
            } else {
                charArrayBuffer.ensureCapacity(estimateParametersLen);
            }
            for (int i = 0; i < nameValuePairArr.length; i++) {
                if (i > 0) {
                    charArrayBuffer.append("; ");
                }
                formatNameValuePair(charArrayBuffer, nameValuePairArr[i], z);
            }
            return charArrayBuffer;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }
}
