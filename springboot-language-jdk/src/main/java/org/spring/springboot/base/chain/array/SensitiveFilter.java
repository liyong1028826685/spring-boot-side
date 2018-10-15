package org.spring.springboot.base.chain.array;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain fc) {
		request.requestStr = request.requestStr.replace("����ҵ", "��ҵ")
		 .replace("����", "") + "---SesitiveFilter()";
		fc.doFilter(request, response, fc);
		response.responseStr += "---SesitiveFilter()";
	
	}

}
