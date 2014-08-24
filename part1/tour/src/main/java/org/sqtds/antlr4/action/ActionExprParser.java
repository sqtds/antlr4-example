// Generated from org\sqtds\antlr4\spiltexpr\ActionExpr.g4 by ANTLR 4.2.2
package org.sqtds.antlr4.action;

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ActionExprParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, MUL=4, DIV=5, ADD=6, SUB=7, ID=8, INT=9, NEWLINE=10, 
		WS=11;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'('", "'='", "'*'", "'/'", "'+'", "'-'", "ID", "INT", 
		"NEWLINE", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2;
	public static final String[] ruleNames = {
		"prog", "stat", "expr"
	};

	@Override
	public String getGrammarFileName() { return "ActionExpr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Integer> memory = new HashMap<String, Integer>();

	public ActionExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionExprListener ) ((ActionExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionExprListener ) ((ActionExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionExprVisitor ) return ((ActionExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6); stat();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr;
		public Token ID;
		public TerminalNode NEWLINE() { return getToken(ActionExprParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ActionExprParser.ID, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionExprListener ) ((ActionExprListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionExprListener ) ((ActionExprListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionExprVisitor ) return ((ActionExprVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(22);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(11); ((StatContext)_localctx).expr = expr(0);
				setState(12); match(NEWLINE);
				System.out.println(((StatContext)_localctx).expr.v);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15); ((StatContext)_localctx).ID = match(ID);
				setState(16); match(3);
				setState(17); ((StatContext)_localctx).expr = expr(0);
				setState(18); match(NEWLINE);

				                                   String id = ((StatContext)_localctx).ID.getText();
				                                   memory.put(id, ((StatContext)_localctx).expr.v);
				                                   
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(21); match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public int v;
		public ExprContext a;
		public Token INT;
		public Token ID;
		public ExprContext e;
		public Token op;
		public ExprContext b;
		public TerminalNode INT() { return getToken(ActionExprParser.INT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(ActionExprParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActionExprListener ) ((ActionExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActionExprListener ) ((ActionExprListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActionExprVisitor ) return ((ActionExprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(25); ((ExprContext)_localctx).INT = match(INT);
				((ExprContext)_localctx).v =  Integer.valueOf(((ExprContext)_localctx).INT.getText());
				}
				break;
			case ID:
				{
				setState(27); ((ExprContext)_localctx).ID = match(ID);

				                                   String id = ((ExprContext)_localctx).ID.getText();
				                                   if ( memory.containsKey(id) ) {
				                                       ((ExprContext)_localctx).v =  memory.get(id);
				                                   }
				                                   
				}
				break;
			case 2:
				{
				setState(29); match(2);
				setState(30); ((ExprContext)_localctx).e = expr(0);
				setState(31); match(1);
				((ExprContext)_localctx).v =  ((ExprContext)_localctx).e.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(36);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(37);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(38); ((ExprContext)_localctx).b = expr(6);

						                                             if ( ((ExprContext)_localctx).op.getType()==MUL ) ((ExprContext)_localctx).v =  ((ExprContext)_localctx).a.v * ((ExprContext)_localctx).b.v;
						                                             else ((ExprContext)_localctx).v =  ((ExprContext)_localctx).a.v / ((ExprContext)_localctx).b.v;
						                                             
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(41);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(42);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(43); ((ExprContext)_localctx).b = expr(5);

						                                             if ( ((ExprContext)_localctx).op.getType()==ADD ) ((ExprContext)_localctx).v =  ((ExprContext)_localctx).a.v + ((ExprContext)_localctx).b.v;
						                                             else ((ExprContext)_localctx).v =  ((ExprContext)_localctx).a.v - ((ExprContext)_localctx).b.v;
						                                             
						}
						break;
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);

		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4%\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64\13\4"+
		"\3\4\2\3\6\5\2\4\6\2\4\3\2\6\7\3\2\b\t9\2\t\3\2\2\2\4\30\3\2\2\2\6$\3"+
		"\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2"+
		"\f\3\3\2\2\2\r\16\5\6\4\2\16\17\7\f\2\2\17\20\b\3\1\2\20\31\3\2\2\2\21"+
		"\22\7\n\2\2\22\23\7\5\2\2\23\24\5\6\4\2\24\25\7\f\2\2\25\26\b\3\1\2\26"+
		"\31\3\2\2\2\27\31\7\f\2\2\30\r\3\2\2\2\30\21\3\2\2\2\30\27\3\2\2\2\31"+
		"\5\3\2\2\2\32\33\b\4\1\2\33\34\7\13\2\2\34%\b\4\1\2\35\36\7\n\2\2\36%"+
		"\b\4\1\2\37 \7\4\2\2 !\5\6\4\2!\"\7\3\2\2\"#\b\4\1\2#%\3\2\2\2$\32\3\2"+
		"\2\2$\35\3\2\2\2$\37\3\2\2\2%\62\3\2\2\2&\'\f\7\2\2\'(\t\2\2\2()\5\6\4"+
		"\b)*\b\4\1\2*\61\3\2\2\2+,\f\6\2\2,-\t\3\2\2-.\5\6\4\7./\b\4\1\2/\61\3"+
		"\2\2\2\60&\3\2\2\2\60+\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2"+
		"\2\63\7\3\2\2\2\64\62\3\2\2\2\7\13\30$\60\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}