// Generated from D:\IdeaProjects\jsnl\src\net\yeah\zhouyou\mickey\snl\antlr4\Snlc.g4 by ANTLR 4.x
package net.yeah.zhouyou.mickey.snl.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SnlcParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, TYPE=2, INTEGER=3, CHAR=4, ARRAY=5, OF=6, RECORD=7, BEGIN=8, 
		END=9, PROCEDURE=10, VAR=11, IF=12, THEN=13, ELSE=14, WHILE=15, DO=16, 
		ENDWH=17, READ=18, WRITE=19, RETURN=20, FI=21, ID=22, INTC=23, ADD=24, 
		SUB=25, MUL=26, DIV=27, EQ=28, LT=29, DOT=30, DDOT=31, AMGT=32, SEM=33, 
		COMMA=34, LBT=35, RBT=36, LSBT=37, RSBT=38, WS=39;
	public static final String[] tokenNames = {
		"<INVALID>", "'program'", "'type'", "'integer'", "'char'", "'array'", 
		"'of'", "'record'", "'begin'", "'end'", "'procedure'", "'var'", "'if'", 
		"'then'", "'else'", "'while'", "'do'", "'endwh'", "'read'", "'write'", 
		"'return'", "'fi'", "ID", "INTC", "'+'", "'-'", "'*'", "'/'", "'='", "'<'", 
		"'.'", "'..'", "':='", "';'", "','", "'('", "')'", "'['", "']'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_programHead = 1, RULE_declarePart = 2, RULE_typeDecpart = 3, 
		RULE_typeDecList = 4, RULE_typeDef = 5, RULE_basicType = 6, RULE_structureType = 7, 
		RULE_arrayType = 8, RULE_recordType = 9, RULE_fieldDecList = 10, RULE_idList = 11, 
		RULE_varDecpart = 12, RULE_varDecList = 13, RULE_procDecpart = 14, RULE_procDeclare = 15, 
		RULE_paramList = 16, RULE_param = 17, RULE_programBody = 18, RULE_stmList = 19, 
		RULE_stm = 20, RULE_assignment = 21, RULE_callStm = 22, RULE_conditionalStm = 23, 
		RULE_loopStm = 24, RULE_inputStm = 25, RULE_outputStm = 26, RULE_actParamList = 27, 
		RULE_condExp = 28, RULE_exp = 29, RULE_factor = 30, RULE_variable = 31, 
		RULE_variMore = 32;
	public static final String[] ruleNames = {
		"program", "programHead", "declarePart", "typeDecpart", "typeDecList", 
		"typeDef", "basicType", "structureType", "arrayType", "recordType", "fieldDecList", 
		"idList", "varDecpart", "varDecList", "procDecpart", "procDeclare", "paramList", 
		"param", "programBody", "stmList", "stm", "assignment", "callStm", "conditionalStm", 
		"loopStm", "inputStm", "outputStm", "actParamList", "condExp", "exp", 
		"factor", "variable", "variMore"
	};

	@Override
	public String getGrammarFileName() { return "Snlc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SnlcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramBodyContext programBody() {
			return getRuleContext(ProgramBodyContext.class,0);
		}
		public DeclarePartContext declarePart() {
			return getRuleContext(DeclarePartContext.class,0);
		}
		public ProgramHeadContext programHead() {
			return getRuleContext(ProgramHeadContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); programHead();
			setState(67); declarePart();
			setState(69);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(68); programBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramHeadContext extends ParserRuleContext {
		public Token programName;
		public TerminalNode ID() { return getToken(SnlcParser.ID, 0); }
		public TerminalNode PROGRAM() { return getToken(SnlcParser.PROGRAM, 0); }
		public ProgramHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitProgramHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeadContext programHead() throws RecognitionException {
		ProgramHeadContext _localctx = new ProgramHeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(PROGRAM);
			setState(72); ((ProgramHeadContext)_localctx).programName = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarePartContext extends ParserRuleContext {
		public VarDecpartContext varDecpart() {
			return getRuleContext(VarDecpartContext.class,0);
		}
		public TypeDecpartContext typeDecpart() {
			return getRuleContext(TypeDecpartContext.class,0);
		}
		public ProcDecpartContext procDecpart() {
			return getRuleContext(ProcDecpartContext.class,0);
		}
		public DeclarePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarePart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitDeclarePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarePartContext declarePart() throws RecognitionException {
		DeclarePartContext _localctx = new DeclarePartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(74); typeDecpart();
				}
			}

			setState(78);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(77); varDecpart();
				}
			}

			setState(81);
			_la = _input.LA(1);
			if (_la==PROCEDURE) {
				{
				setState(80); procDecpart();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDecpartContext extends ParserRuleContext {
		public TypeDecListContext typeDecList() {
			return getRuleContext(TypeDecListContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(SnlcParser.TYPE, 0); }
		public TypeDecpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecpart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitTypeDecpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDecpartContext typeDecpart() throws RecognitionException {
		TypeDecpartContext _localctx = new TypeDecpartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDecpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(TYPE);
			setState(84); typeDecList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDecListContext extends ParserRuleContext {
		public Token typeId;
		public TerminalNode ID() { return getToken(SnlcParser.ID, 0); }
		public TypeDecListContext typeDecList() {
			return getRuleContext(TypeDecListContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TypeDecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDecList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitTypeDecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDecListContext typeDecList() throws RecognitionException {
		TypeDecListContext _localctx = new TypeDecListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDecList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); ((TypeDecListContext)_localctx).typeId = match(ID);
			setState(87); match(AMGT);
			setState(88); typeDef();
			setState(89); match(SEM);
			setState(91);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(90); typeDecList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefContext extends ParserRuleContext {
		public StructureTypeContext structureType() {
			return getRuleContext(StructureTypeContext.class,0);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnlcParser.ID, 0); }
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeDef);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case INTEGER:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); basicType();
				}
				break;
			case ARRAY:
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); structureType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(95); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(SnlcParser.CHAR, 0); }
		public TerminalNode INTEGER() { return getToken(SnlcParser.INTEGER, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructureTypeContext extends ParserRuleContext {
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitStructureType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureTypeContext structureType() throws RecognitionException {
		StructureTypeContext _localctx = new StructureTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structureType);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); recordType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public Token low;
		public Token top;
		public List<TerminalNode> INTC() { return getTokens(SnlcParser.INTC); }
		public TerminalNode INTC(int i) {
			return getToken(SnlcParser.INTC, i);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode OF() { return getToken(SnlcParser.OF, 0); }
		public TerminalNode ARRAY() { return getToken(SnlcParser.ARRAY, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(ARRAY);
			setState(105); match(LSBT);
			setState(106); ((ArrayTypeContext)_localctx).low = match(INTC);
			setState(107); match(DDOT);
			setState(108); ((ArrayTypeContext)_localctx).top = match(INTC);
			setState(109); match(RSBT);
			setState(110); match(OF);
			setState(111); basicType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordTypeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(SnlcParser.RECORD, 0); }
		public FieldDecListContext fieldDecList() {
			return getRuleContext(FieldDecListContext.class,0);
		}
		public TerminalNode END() { return getToken(SnlcParser.END, 0); }
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_recordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(RECORD);
			setState(114); fieldDecList();
			setState(115); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDecListContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public FieldDecListContext fieldDecList() {
			return getRuleContext(FieldDecListContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public FieldDecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitFieldDecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDecListContext fieldDecList() throws RecognitionException {
		FieldDecListContext _localctx = new FieldDecListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldDecList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); typeDef();
			setState(118); idList();
			setState(119); match(SEM);
			setState(121);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << CHAR) | (1L << ARRAY) | (1L << RECORD) | (1L << ID))) != 0)) {
				{
				setState(120); fieldDecList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnlcParser.ID, 0); }
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(ID);
			setState(126);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(124); match(COMMA);
				setState(125); idList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDecpartContext extends ParserRuleContext {
		public VarDecListContext varDecList() {
			return getRuleContext(VarDecListContext.class,0);
		}
		public TerminalNode VAR() { return getToken(SnlcParser.VAR, 0); }
		public VarDecpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecpart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitVarDecpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecpartContext varDecpart() throws RecognitionException {
		VarDecpartContext _localctx = new VarDecpartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDecpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(VAR);
			setState(129); varDecList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDecListContext extends ParserRuleContext {
		public VarDecListContext varDecList() {
			return getRuleContext(VarDecListContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public VarDecListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitVarDecList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecListContext varDecList() throws RecognitionException {
		VarDecListContext _localctx = new VarDecListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varDecList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); typeDef();
			setState(132); idList();
			setState(133); match(SEM);
			setState(135);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << CHAR) | (1L << ARRAY) | (1L << RECORD) | (1L << ID))) != 0)) {
				{
				setState(134); varDecList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcDecpartContext extends ParserRuleContext {
		public ProcDeclareContext procDeclare() {
			return getRuleContext(ProcDeclareContext.class,0);
		}
		public ProcDecpartContext procDecpart() {
			return getRuleContext(ProcDecpartContext.class,0);
		}
		public ProcDecpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procDecpart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitProcDecpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcDecpartContext procDecpart() throws RecognitionException {
		ProcDecpartContext _localctx = new ProcDecpartContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_procDecpart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); procDeclare();
			setState(139);
			_la = _input.LA(1);
			if (_la==PROCEDURE) {
				{
				setState(138); procDecpart();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcDeclareContext extends ParserRuleContext {
		public Token procName;
		public ProgramBodyContext programBody() {
			return getRuleContext(ProgramBodyContext.class,0);
		}
		public DeclarePartContext declarePart() {
			return getRuleContext(DeclarePartContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnlcParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(SnlcParser.PROCEDURE, 0); }
		public ProcDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procDeclare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitProcDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcDeclareContext procDeclare() throws RecognitionException {
		ProcDeclareContext _localctx = new ProcDeclareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_procDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(PROCEDURE);
			setState(142); ((ProcDeclareContext)_localctx).procName = match(ID);
			setState(143); match(LBT);
			setState(145);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << CHAR) | (1L << ARRAY) | (1L << RECORD) | (1L << VAR) | (1L << ID))) != 0)) {
				{
				setState(144); paramList();
				}
			}

			setState(147); match(RBT);
			setState(148); match(SEM);
			setState(149); declarePart();
			setState(150); programBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); param();
			setState(155);
			_la = _input.LA(1);
			if (_la==SEM) {
				{
				setState(153); match(SEM);
				setState(154); paramList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SnlcParser.VAR, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(157); match(VAR);
				}
			}

			setState(160); typeDef();
			setState(161); idList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramBodyContext extends ParserRuleContext {
		public StmListContext stmList() {
			return getRuleContext(StmListContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(SnlcParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SnlcParser.END, 0); }
		public ProgramBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitProgramBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBodyContext programBody() throws RecognitionException {
		ProgramBodyContext _localctx = new ProgramBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_programBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(BEGIN);
			setState(164); stmList();
			setState(165); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmListContext extends ParserRuleContext {
		public StmContext stm() {
			return getRuleContext(StmContext.class,0);
		}
		public StmListContext stmList() {
			return getRuleContext(StmListContext.class,0);
		}
		public StmListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitStmList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmListContext stmList() throws RecognitionException {
		StmListContext _localctx = new StmListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); stm();
			setState(170);
			_la = _input.LA(1);
			if (_la==SEM) {
				{
				setState(168); match(SEM);
				setState(169); stmList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmContext extends ParserRuleContext {
		public OutputStmContext outputStm() {
			return getRuleContext(OutputStmContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LoopStmContext loopStm() {
			return getRuleContext(LoopStmContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SnlcParser.RETURN, 0); }
		public CallStmContext callStm() {
			return getRuleContext(CallStmContext.class,0);
		}
		public ConditionalStmContext conditionalStm() {
			return getRuleContext(ConditionalStmContext.class,0);
		}
		public InputStmContext inputStm() {
			return getRuleContext(InputStmContext.class,0);
		}
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stm);
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); conditionalStm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); loopStm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174); inputStm();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175); outputStm();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176); assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177); callStm();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(178); match(RETURN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); variable();
			setState(182); match(AMGT);
			setState(183); exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallStmContext extends ParserRuleContext {
		public ActParamListContext actParamList() {
			return getRuleContext(ActParamListContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnlcParser.ID, 0); }
		public CallStmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitCallStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStmContext callStm() throws RecognitionException {
		CallStmContext _localctx = new CallStmContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_callStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(ID);
			setState(186); match(LBT);
			setState(188);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INTC) | (1L << LBT))) != 0)) {
				{
				setState(187); actParamList();
				}
			}

			setState(190); match(RBT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStmContext extends ParserRuleContext {
		public CondExpContext condExp() {
			return getRuleContext(CondExpContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SnlcParser.THEN, 0); }
		public TerminalNode IF() { return getToken(SnlcParser.IF, 0); }
		public TerminalNode FI() { return getToken(SnlcParser.FI, 0); }
		public TerminalNode ELSE() { return getToken(SnlcParser.ELSE, 0); }
		public StmListContext stmList(int i) {
			return getRuleContext(StmListContext.class,i);
		}
		public List<StmListContext> stmList() {
			return getRuleContexts(StmListContext.class);
		}
		public ConditionalStmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitConditionalStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStmContext conditionalStm() throws RecognitionException {
		ConditionalStmContext _localctx = new ConditionalStmContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditionalStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(IF);
			setState(193); condExp();
			setState(194); match(THEN);
			setState(195); stmList();
			setState(198);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(196); match(ELSE);
				setState(197); stmList();
				}
			}

			setState(200); match(FI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStmContext extends ParserRuleContext {
		public CondExpContext condExp() {
			return getRuleContext(CondExpContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(SnlcParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(SnlcParser.DO, 0); }
		public StmListContext stmList() {
			return getRuleContext(StmListContext.class,0);
		}
		public TerminalNode ENDWH() { return getToken(SnlcParser.ENDWH, 0); }
		public LoopStmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitLoopStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStmContext loopStm() throws RecognitionException {
		LoopStmContext _localctx = new LoopStmContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loopStm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(WHILE);
			setState(203); condExp();
			setState(204); match(DO);
			setState(205); stmList();
			setState(206); match(ENDWH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputStmContext extends ParserRuleContext {
		public Token invar;
		public TerminalNode ID() { return getToken(SnlcParser.ID, 0); }
		public TerminalNode READ() { return getToken(SnlcParser.READ, 0); }
		public InputStmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitInputStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStmContext inputStm() throws RecognitionException {
		InputStmContext _localctx = new InputStmContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_inputStm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(READ);
			setState(209); match(LBT);
			setState(210); ((InputStmContext)_localctx).invar = match(ID);
			setState(211); match(RBT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputStmContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(SnlcParser.WRITE, 0); }
		public OutputStmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitOutputStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStmContext outputStm() throws RecognitionException {
		OutputStmContext _localctx = new OutputStmContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_outputStm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(WRITE);
			setState(214); match(LBT);
			setState(215); exp(0);
			setState(216); match(RBT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActParamListContext extends ParserRuleContext {
		public ActParamListContext actParamList() {
			return getRuleContext(ActParamListContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ActParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actParamList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitActParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActParamListContext actParamList() throws RecognitionException {
		ActParamListContext _localctx = new ActParamListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_actParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); exp(0);
			setState(221);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(219); match(COMMA);
				setState(220); actParamList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondExpContext extends ParserRuleContext {
		public Token cmpOp;
		public TerminalNode LT() { return getToken(SnlcParser.LT, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SnlcParser.EQ, 0); }
		public CondExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitCondExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExpContext condExp() throws RecognitionException {
		CondExpContext _localctx = new CondExpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_condExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); exp(0);
			setState(226);
			_la = _input.LA(1);
			if (_la==EQ || _la==LT) {
				{
				setState(224);
				((CondExpContext)_localctx).cmpOp = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==LT) ) {
					((CondExpContext)_localctx).cmpOp = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(225); exp(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public Token op;
		public TerminalNode MUL() { return getToken(SnlcParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SnlcParser.DIV, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SUB() { return getToken(SnlcParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(SnlcParser.ADD, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(229); factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(231);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(232);
						((ExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(233); exp(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(234);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(235);
						((ExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(236); exp(3);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Token intVal;
		public TerminalNode INTC() { return getToken(SnlcParser.INTC, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_factor);
		try {
			setState(248);
			switch (_input.LA(1)) {
			case LBT:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); match(LBT);
				setState(243); exp(0);
				setState(244); match(RBT);
				}
				break;
			case INTC:
				enterOuterAlt(_localctx, 2);
				{
				setState(246); ((FactorContext)_localctx).intVal = match(INTC);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(247); variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariMoreContext variMore() {
			return getRuleContext(VariMoreContext.class,0);
		}
		public TerminalNode ID() { return getToken(SnlcParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(ID);
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(251); variMore();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariMoreContext extends ParserRuleContext {
		public VariMoreContext variMore() {
			return getRuleContext(VariMoreContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SnlcParser.DOT, 0); }
		public TerminalNode ID() { return getToken(SnlcParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VariMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variMore; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SnlcVisitor ) return ((SnlcVisitor<? extends T>)visitor).visitVariMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariMoreContext variMore() throws RecognitionException {
		VariMoreContext _localctx = new VariMoreContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variMore);
		try {
			setState(263);
			switch (_input.LA(1)) {
			case LSBT:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); match(LSBT);
				setState(255); exp(0);
				setState(256); match(RSBT);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(258); match(DOT);
				setState(259); match(ID);
				setState(261);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(260); variMore();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\5\2H\n\2\3\3\3\3\3\3\3\4\5\4N\n\4\3\4\5\4Q\n\4"+
		"\3\4\5\4T\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\5\7"+
		"c\n\7\3\b\3\b\3\t\3\t\5\ti\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f|\n\f\3\r\3\r\3\r\5\r\u0081\n\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u008a\n\17\3\20\3\20\5\20\u008e\n"+
		"\20\3\21\3\21\3\21\3\21\5\21\u0094\n\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\5\22\u009e\n\22\3\23\5\23\u00a1\n\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\5\25\u00ad\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00b6\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u00bf"+
		"\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00c9\n\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\5\35\u00e0\n\35\3\36\3\36\3\36\5\36\u00e5\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u00f0\n\37\f\37"+
		"\16\37\u00f3\13\37\3 \3 \3 \3 \3 \3 \5 \u00fb\n \3!\3!\5!\u00ff\n!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0108\n\"\5\"\u010a\n\"\3\"\2\3<#\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\6\3\2\5\6"+
		"\3\2\36\37\3\2\34\35\3\2\32\33\u010b\2D\3\2\2\2\4I\3\2\2\2\6M\3\2\2\2"+
		"\bU\3\2\2\2\nX\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20h\3\2\2\2\22j\3\2\2\2"+
		"\24s\3\2\2\2\26w\3\2\2\2\30}\3\2\2\2\32\u0082\3\2\2\2\34\u0085\3\2\2\2"+
		"\36\u008b\3\2\2\2 \u008f\3\2\2\2\"\u009a\3\2\2\2$\u00a0\3\2\2\2&\u00a5"+
		"\3\2\2\2(\u00a9\3\2\2\2*\u00b5\3\2\2\2,\u00b7\3\2\2\2.\u00bb\3\2\2\2\60"+
		"\u00c2\3\2\2\2\62\u00cc\3\2\2\2\64\u00d2\3\2\2\2\66\u00d7\3\2\2\28\u00dc"+
		"\3\2\2\2:\u00e1\3\2\2\2<\u00e6\3\2\2\2>\u00fa\3\2\2\2@\u00fc\3\2\2\2B"+
		"\u0109\3\2\2\2DE\5\4\3\2EG\5\6\4\2FH\5&\24\2GF\3\2\2\2GH\3\2\2\2H\3\3"+
		"\2\2\2IJ\7\3\2\2JK\7\30\2\2K\5\3\2\2\2LN\5\b\5\2ML\3\2\2\2MN\3\2\2\2N"+
		"P\3\2\2\2OQ\5\32\16\2PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RT\5\36\20\2SR\3\2"+
		"\2\2ST\3\2\2\2T\7\3\2\2\2UV\7\4\2\2VW\5\n\6\2W\t\3\2\2\2XY\7\30\2\2YZ"+
		"\7\"\2\2Z[\5\f\7\2[]\7#\2\2\\^\5\n\6\2]\\\3\2\2\2]^\3\2\2\2^\13\3\2\2"+
		"\2_c\5\16\b\2`c\5\20\t\2ac\7\30\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\r\3"+
		"\2\2\2de\t\2\2\2e\17\3\2\2\2fi\5\22\n\2gi\5\24\13\2hf\3\2\2\2hg\3\2\2"+
		"\2i\21\3\2\2\2jk\7\7\2\2kl\7\'\2\2lm\7\31\2\2mn\7!\2\2no\7\31\2\2op\7"+
		"(\2\2pq\7\b\2\2qr\5\16\b\2r\23\3\2\2\2st\7\t\2\2tu\5\26\f\2uv\7\13\2\2"+
		"v\25\3\2\2\2wx\5\f\7\2xy\5\30\r\2y{\7#\2\2z|\5\26\f\2{z\3\2\2\2{|\3\2"+
		"\2\2|\27\3\2\2\2}\u0080\7\30\2\2~\177\7$\2\2\177\u0081\5\30\r\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\31\3\2\2\2\u0082\u0083\7\r\2\2\u0083"+
		"\u0084\5\34\17\2\u0084\33\3\2\2\2\u0085\u0086\5\f\7\2\u0086\u0087\5\30"+
		"\r\2\u0087\u0089\7#\2\2\u0088\u008a\5\34\17\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\35\3\2\2\2\u008b\u008d\5 \21\2\u008c\u008e\5\36\20"+
		"\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\37\3\2\2\2\u008f\u0090"+
		"\7\f\2\2\u0090\u0091\7\30\2\2\u0091\u0093\7%\2\2\u0092\u0094\5\"\22\2"+
		"\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096"+
		"\7&\2\2\u0096\u0097\7#\2\2\u0097\u0098\5\6\4\2\u0098\u0099\5&\24\2\u0099"+
		"!\3\2\2\2\u009a\u009d\5$\23\2\u009b\u009c\7#\2\2\u009c\u009e\5\"\22\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e#\3\2\2\2\u009f\u00a1\7"+
		"\r\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\5\f\7\2\u00a3\u00a4\5\30\r\2\u00a4%\3\2\2\2\u00a5\u00a6\7\n\2\2"+
		"\u00a6\u00a7\5(\25\2\u00a7\u00a8\7\13\2\2\u00a8\'\3\2\2\2\u00a9\u00ac"+
		"\5*\26\2\u00aa\u00ab\7#\2\2\u00ab\u00ad\5(\25\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad)\3\2\2\2\u00ae\u00b6\5\60\31\2\u00af\u00b6\5\62\32"+
		"\2\u00b0\u00b6\5\64\33\2\u00b1\u00b6\5\66\34\2\u00b2\u00b6\5,\27\2\u00b3"+
		"\u00b6\5.\30\2\u00b4\u00b6\7\26\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00af\3"+
		"\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6+\3\2\2\2\u00b7\u00b8\5@!\2\u00b8"+
		"\u00b9\7\"\2\2\u00b9\u00ba\5<\37\2\u00ba-\3\2\2\2\u00bb\u00bc\7\30\2\2"+
		"\u00bc\u00be\7%\2\2\u00bd\u00bf\58\35\2\u00be\u00bd\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7&\2\2\u00c1/\3\2\2\2\u00c2\u00c3"+
		"\7\16\2\2\u00c3\u00c4\5:\36\2\u00c4\u00c5\7\17\2\2\u00c5\u00c8\5(\25\2"+
		"\u00c6\u00c7\7\20\2\2\u00c7\u00c9\5(\25\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\27\2\2\u00cb\61\3\2\2\2\u00cc"+
		"\u00cd\7\21\2\2\u00cd\u00ce\5:\36\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\5"+
		"(\25\2\u00d0\u00d1\7\23\2\2\u00d1\63\3\2\2\2\u00d2\u00d3\7\24\2\2\u00d3"+
		"\u00d4\7%\2\2\u00d4\u00d5\7\30\2\2\u00d5\u00d6\7&\2\2\u00d6\65\3\2\2\2"+
		"\u00d7\u00d8\7\25\2\2\u00d8\u00d9\7%\2\2\u00d9\u00da\5<\37\2\u00da\u00db"+
		"\7&\2\2\u00db\67\3\2\2\2\u00dc\u00df\5<\37\2\u00dd\u00de\7$\2\2\u00de"+
		"\u00e0\58\35\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e09\3\2\2\2"+
		"\u00e1\u00e4\5<\37\2\u00e2\u00e3\t\3\2\2\u00e3\u00e5\5<\37\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5;\3\2\2\2\u00e6\u00e7\b\37\1\2\u00e7"+
		"\u00e8\5> \2\u00e8\u00f1\3\2\2\2\u00e9\u00ea\f\5\2\2\u00ea\u00eb\t\4\2"+
		"\2\u00eb\u00f0\5<\37\6\u00ec\u00ed\f\4\2\2\u00ed\u00ee\t\5\2\2\u00ee\u00f0"+
		"\5<\37\5\u00ef\u00e9\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2=\3\2\2\2\u00f3\u00f1\3\2\2\2"+
		"\u00f4\u00f5\7%\2\2\u00f5\u00f6\5<\37\2\u00f6\u00f7\7&\2\2\u00f7\u00fb"+
		"\3\2\2\2\u00f8\u00fb\7\31\2\2\u00f9\u00fb\5@!\2\u00fa\u00f4\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb?\3\2\2\2\u00fc\u00fe\7\30\2\2"+
		"\u00fd\u00ff\5B\"\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffA\3\2"+
		"\2\2\u0100\u0101\7\'\2\2\u0101\u0102\5<\37\2\u0102\u0103\7(\2\2\u0103"+
		"\u010a\3\2\2\2\u0104\u0105\7 \2\2\u0105\u0107\7\30\2\2\u0106\u0108\5B"+
		"\"\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0100\3\2\2\2\u0109\u0104\3\2\2\2\u010aC\3\2\2\2\34GMPS]bh{\u0080\u0089"+
		"\u008d\u0093\u009d\u00a0\u00ac\u00b5\u00be\u00c8\u00df\u00e4\u00ef\u00f1"+
		"\u00fa\u00fe\u0107\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}