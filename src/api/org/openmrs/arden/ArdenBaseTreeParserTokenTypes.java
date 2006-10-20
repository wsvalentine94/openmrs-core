// $ANTLR 2.7.6 (2005-12-22): "ArdenRecognizer.g" -> "ArdenBaseParser.java"$

package org.openmrs.arden;

import java.io.*;
import antlr.CommonAST;
import antlr.collections.AST;
import antlr.*;
import org.openmrs.arden.MLMObject;
import org.openmrs.arden.MLMObjectElement;
import java.lang.Integer;

public interface ArdenBaseTreeParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int AND = 4;
	int WEIRD_IDENT = 5;
	int IS = 6;
	int ARE = 7;
	int WAS = 8;
	int WERE = 9;
	int COUNT = 10;
	int IN = 11;
	int LESS = 12;
	int GREATER = 13;
	int THE = 14;
	int THAN = 15;
	int FROM = 16;
	int BEFORE = 17;
	int AFTER = 18;
	int AGO = 19;
	int WRITE = 20;
	int AT = 21;
	int LET = 22;
	int NOW = 23;
	int BE = 24;
	int YEAR = 25;
	int YEARS = 26;
	int IF = 27;
	int IT = 28;
	int THEY = 29;
	int NOT = 30;
	int OR = 31;
	int THEN = 32;
	int READ = 33;
	int MINIMUM = 34;
	int MIN = 35;
	int MAXIMUM = 36;
	int MAX = 37;
	int LAST = 38;
	int FIRST = 39;
	int EARLIEST = 40;
	int LATEST = 41;
	int EVENT = 42;
	int WHERE = 43;
	int EXIST = 44;
	int EXISTS = 45;
	int PAST = 46;
	int DAYS = 47;
	int DAY = 48;
	int MONTH = 49;
	int MONTHS = 50;
	int WEEK = 51;
	int WEEKS = 52;
	int AVG = 53;
	int AVERAGE = 54;
	int SUM = 55;
	int MEDIAN = 56;
	int CONCLUDE = 57;
	int ELSE = 58;
	int ELSEIF = 59;
	int ENDIF = 60;
	int TRUE = 61;
	int FALSE = 62;
	int DATA = 63;
	int LOGIC = 64;
	int ACTION = 65;
	int MAINTENANCE = 66;
	int LIBRARY = 67;
	int FILENAME = 68;
	int MLMNAME = 69;
	int OF = 70;
	int TIME = 71;
	int WITHIN = 72;
	int CALL = 73;
	int WITH = 74;
	int TO = 75;
	int LITERAL_end = 76;
	int COLON = 77;
	int LITERAL_knowledge = 78;
	int LITERAL_title = 79;
	int ENDBLOCK = 80;
	int DOT = 81;
	int MINUS = 82;
	int UNDERSCORE = 83;
	int LITERAL_arden = 84;
	// "ASTM-E" = 85
	int INTLIT = 86;
	int LITERAL_version = 87;
	int DIGIT = 88;
	int LITERAL_institution = 89;
	int LITERAL_author = 90;
	int SEMI = 91;
	int LITERAL_specialist = 92;
	int LITERAL_date = 93;
	int LITERAL_validation = 94;
	int LITERAL_production = 95;
	int LITERAL_research = 96;
	int LITERAL_testing = 97;
	int LITERAL_expired = 98;
	int TIMES = 99;
	int ID = 100;
	int LPAREN = 101;
	int RPAREN = 102;
	// ":" = 103
	int LITERAL_T = 104;
	int LITERAL_t = 105;
	// "." = 106
	// "+" = 107
	// "-" = 108
	int LITERAL_Z = 109;
	int LITERAL_z = 110;
	int LITERAL_purpose = 111;
	int LITERAL_explanation = 112;
	int LITERAL_keywords = 113;
	int LITERAL_citations = 114;
	int LITERAL_SUPPORT = 115;
	int LITERAL_REFUTE = 116;
	int LITERAL_links = 117;
	int SINGLE_QUOTE = 118;
	int LITERAL_type = 119;
	// "data-driven" = 120
	int LITERAL_data_driven = 121;
	int COMMENT = 122;
	int ML_COMMENT = 123;
	int BECOMES = 124;
	int COMMA = 125;
	int LITERAL_EVENT = 126;
	int LITERAL_Event = 127;
	int ARDEN_CURLY_BRACKETS = 128;
	int LITERAL_PRESENT = 129;
	int LITERAL_NULL = 130;
	int LITERAL_BOOLEAN = 131;
	int LITERAL_NUMBER = 132;
	int LITERAL_DURATION = 133;
	int LITERAL_STRING = 134;
	int LITERAL_LIST = 135;
	int LITERAL_OBJECT = 136;
	int EQUAL = 137;
	int LITERAL_hour = 138;
	int LITERAL_hours = 139;
	int LITERAL_minute = 140;
	int LITERAL_minutes = 141;
	int LITERAL_second = 142;
	int LITERAL_seconds = 143;
	int LITERAL_OCCUR = 144;
	int LITERAL_Occur = 145;
	int LITERAL_occur = 146;
	int LITERAL_OCCURS = 147;
	int LITERAL_Occurs = 148;
	int LITERAL_occurs = 149;
	int LITERAL_OCCURRED = 150;
	int LITERAL_Occurred = 151;
	int LITERAL_priority = 152;
	int LITERAL_evoke = 153;
	int LITERAL_CALL = 154;
	int LITERAL_Any = 155;
	int EQUALS = 156;
	int LITERAL_EQ = 157;
	int LT = 158;
	int LITERAL_LT = 159;
	int GT = 160;
	int LITERAL_GT = 161;
	int LTE = 162;
	int LITERAL_LE = 163;
	int GTE = 164;
	int LITERAL_GE = 165;
	int NE = 166;
	int LITERAL_NE = 167;
	int ACTION_OP = 168;
	int LITERAL_urgency = 169;
	int LITERAL_MERGE = 170;
	int LITERAL_SORT = 171;
	int LITERAL_DATA = 172;
	int LITERAL_SEQTO = 173;
	// "*" = 174
	// "/" = 175
	int STRING_LITERAL = 176;
}
