package com.makers.moneytree;
//
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class LandingPageTest {
//    static Playwright playwright;
//    static Browser browser;
//    BrowserContext context;
//    Page page;
//
//    @Configuration
//    public static class AppConfig {
//        @Bean
//        public User user() {
//            return new User();
//        }
//    }
//
//    @BeforeAll
//    static void launchBrowser(){
//        playwright = Playwright.create();
//        browser = playwright.chromium().launch();
//    }
//
//    @AfterAll
//    static void closeBrowser() {
//        browser.close();
//    }
//
//    @BeforeEach
//    void createContextAndPage() {
//        context = browser.newContext();
//        page = context.newPage();
//    }
//
//    @AfterEach
//    void closeContext() {
//        context.close();
//    }
//
//    @MockBean
//    private UserService userService;
//
//    @MockBean
//    private UserController controller;
//
//    @Test
//    public void signupReturnsSuccess(){
//
//        final HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
//
//        String userJson = "{\"name\": \"username\", \"email\": \"example@email.com\", \"password\": \"password\"}";
//
//        RestTemplate restTemplate = new RestTemplate();
//        final ResponseEntity<String> response = restTemplate.postForEntity(
//                "http://localhost:8080/users/signup",
//                new HttpEntity<>(userJson, headers),
//                String.class
//        );
//
//        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//        assertThat(response.getBody()).isEqualTo("Email already exists");
//
//    }
//}
