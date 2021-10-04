package com.fundamentos.sprinboot.fundamentos;

import com.fundamentos.sprinboot.fundamentos.bean.MyBean;
import com.fundamentos.sprinboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.sprinboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency ComponentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;

	public FundamentosApplication (@Qualifier("componentTwoImplement") ComponentDependency ComponentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency) {
		this.ComponentDependency = ComponentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) {
		ComponentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
	}
}
